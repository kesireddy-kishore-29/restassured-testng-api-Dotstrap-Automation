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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-170bb5f4-eb41-4366-9c26-9da72bb83d37` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-5f457757-7d6e-4b40-bbc1-68ea4ae65fb6` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 12 | `qa-8e4644bb-8b00-4983-a636-5d5523ac0250` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-8c08b4c0-0f6c-4fc9-9afb-90a99112352d` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-d0caaa11-e38d-4bf5-b9d0-0306238cfd98` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-170bb5f4-eb41-4366-9c26-9da72bb83d37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-170bb5f4-eb41-4366-9c26-9da72bb83d37
Content-Type: application/json

--- request body ---
{"handle":"qa-0268d84760c7","displayName":"QA 0268d84760c7","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-170bb5f4-eb41-4366-9c26-9da72bb83d37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 6
Location: /v1/accounts/qa-0268d84760c7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d6857d32-c3df-4252-804d-57113225963b","handle":"qa-0268d84760c7","displayName":"QA 0268d84760c7","region":"eu","role":"user","createdAt":"2026-11-20T10:10:04.180650018Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5f457757-7d6e-4b40-bbc1-68ea4ae65fb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f457757-7d6e-4b40-bbc1-68ea4ae65fb6
Content-Type: application/json

--- request body ---
{"handle":"qa-0268d84760c7","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f457757-7d6e-4b40-bbc1-68ea4ae65fb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d6857d32-c3df-4252-804d-57113225963b"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-8e4644bb-8b00-4983-a636-5d5523ac0250

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e4644bb-8b00-4983-a636-5d5523ac0250
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e4644bb-8b00-4983-a636-5d5523ac0250
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-8e4644bb-8b00-4983-a636-5d5523ac0250"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8c08b4c0-0f6c-4fc9-9afb-90a99112352d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c08b4c0-0f6c-4fc9-9afb-90a99112352d
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8c08b4c0-0f6c-4fc9-9afb-90a99112352d
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
correlation: qa-d0caaa11-e38d-4bf5-b9d0-0306238cfd98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0caaa11-e38d-4bf5-b9d0-0306238cfd98
Content-Type: application/json

--- request body ---
{"handle":"qa-0268d84760c7","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0caaa11-e38d-4bf5-b9d0-0306238cfd98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 277
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d0caaa11-e38d-4bf5-b9d0-0306238cfd98"}
```
