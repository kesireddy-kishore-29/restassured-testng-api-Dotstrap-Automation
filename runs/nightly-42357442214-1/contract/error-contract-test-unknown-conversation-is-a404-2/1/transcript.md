# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-f489b0d3-e6a9-44cc-948a-64964c603bec` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-f6667610-34ef-44ea-9d7c-862868a28fa0` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 11 | `qa-224ec54d-6f93-4385-9f97-880877573869` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-64929acd-38a1-4dfc-a31f-3abf9ffdea94` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-de233d82-8a01-4c16-98a9-3e74463d1d10` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f489b0d3-e6a9-44cc-948a-64964c603bec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f489b0d3-e6a9-44cc-948a-64964c603bec
Content-Type: application/json

--- request body ---
{"handle":"qa-3e704c2ab668","displayName":"QA 3e704c2ab668","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f489b0d3-e6a9-44cc-948a-64964c603bec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Location: /v1/accounts/qa-3e704c2ab668
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aacb67d6-08b2-492c-b70b-0a44a9ea5f24","handle":"qa-3e704c2ab668","displayName":"QA 3e704c2ab668","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.825204519Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f6667610-34ef-44ea-9d7c-862868a28fa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6667610-34ef-44ea-9d7c-862868a28fa0
Content-Type: application/json

--- request body ---
{"handle":"qa-3e704c2ab668","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6667610-34ef-44ea-9d7c-862868a28fa0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aacb67d6-08b2-492c-b70b-0a44a9ea5f24"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-224ec54d-6f93-4385-9f97-880877573869

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-224ec54d-6f93-4385-9f97-880877573869
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-224ec54d-6f93-4385-9f97-880877573869
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-224ec54d-6f93-4385-9f97-880877573869"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-64929acd-38a1-4dfc-a31f-3abf9ffdea94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64929acd-38a1-4dfc-a31f-3abf9ffdea94
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-64929acd-38a1-4dfc-a31f-3abf9ffdea94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-de233d82-8a01-4c16-98a9-3e74463d1d10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de233d82-8a01-4c16-98a9-3e74463d1d10
Content-Type: application/json

--- request body ---
{"handle":"qa-3e704c2ab668","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de233d82-8a01-4c16-98a9-3e74463d1d10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-de233d82-8a01-4c16-98a9-3e74463d1d10"}
```
