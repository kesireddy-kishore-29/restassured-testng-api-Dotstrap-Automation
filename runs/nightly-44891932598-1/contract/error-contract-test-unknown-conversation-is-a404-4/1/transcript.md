# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-c4a749e3-5114-44a3-bae9-cf9b0755e3c0` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-70d94215-21e4-46f7-83d6-83dce42f3b38` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 7 | `qa-ffe822d0-47e5-47a4-ad59-e61668d2606e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-28b5c9ac-1b68-43e8-a606-eca21e2a2a73` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-fc777747-dfc6-4bdd-9572-282a24756998` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c4a749e3-5114-44a3-bae9-cf9b0755e3c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4a749e3-5114-44a3-bae9-cf9b0755e3c0
Content-Type: application/json

--- request body ---
{"handle":"qa-ebb774da6c69","displayName":"QA ebb774da6c69","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4a749e3-5114-44a3-bae9-cf9b0755e3c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 5
Location: /v1/accounts/qa-ebb774da6c69
X-Served-Region: eu
Content-Length: 181

{"id":"acc_08f5b16d-d105-4066-915b-da24f166fee5","handle":"qa-ebb774da6c69","displayName":"QA ebb774da6c69","region":"eu","role":"user","createdAt":"2026-11-21T09:57:13.381579821Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-70d94215-21e4-46f7-83d6-83dce42f3b38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70d94215-21e4-46f7-83d6-83dce42f3b38
Content-Type: application/json

--- request body ---
{"handle":"qa-ebb774da6c69","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-70d94215-21e4-46f7-83d6-83dce42f3b38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_08f5b16d-d105-4066-915b-da24f166fee5"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-ffe822d0-47e5-47a4-ad59-e61668d2606e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffe822d0-47e5-47a4-ad59-e61668d2606e
Content-Type: application/json

--- response: 404 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ffe822d0-47e5-47a4-ad59-e61668d2606e
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-ffe822d0-47e5-47a4-ad59-e61668d2606e"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-28b5c9ac-1b68-43e8-a606-eca21e2a2a73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28b5c9ac-1b68-43e8-a606-eca21e2a2a73
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-28b5c9ac-1b68-43e8-a606-eca21e2a2a73
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
correlation: qa-fc777747-dfc6-4bdd-9572-282a24756998

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc777747-dfc6-4bdd-9572-282a24756998
Content-Type: application/json

--- request body ---
{"handle":"qa-ebb774da6c69","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc777747-dfc6-4bdd-9572-282a24756998
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fc777747-dfc6-4bdd-9572-282a24756998"}
```
