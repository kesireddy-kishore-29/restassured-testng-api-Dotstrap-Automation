# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-3b6960d0-50ba-414c-9ec3-eaf2ef79e9b6` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-f6c1339d-dd62-4f02-a26e-17a13ac38952` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 16 | `qa-85aa5186-5fb4-4ba6-8097-bb094602998d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-637de44e-1187-456b-9285-d47c7aec39b6` |
| 5 | `POST /v1/auth/token` | 401 | 16 | `qa-f66ccb46-0257-4076-9046-a3a7fd5d7ba4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3b6960d0-50ba-414c-9ec3-eaf2ef79e9b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b6960d0-50ba-414c-9ec3-eaf2ef79e9b6
Content-Type: application/json

--- request body ---
{"handle":"qa-2f1f7ef08434","displayName":"QA 2f1f7ef08434","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b6960d0-50ba-414c-9ec3-eaf2ef79e9b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 7
Location: /v1/accounts/qa-2f1f7ef08434
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba99e867-a871-42e7-94d5-1b94a2f54134","handle":"qa-2f1f7ef08434","displayName":"QA 2f1f7ef08434","region":"eu","role":"user","createdAt":"2026-11-18T10:19:53.280703076Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f6c1339d-dd62-4f02-a26e-17a13ac38952

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6c1339d-dd62-4f02-a26e-17a13ac38952
Content-Type: application/json

--- request body ---
{"handle":"qa-2f1f7ef08434","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6c1339d-dd62-4f02-a26e-17a13ac38952
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba99e867-a871-42e7-94d5-1b94a2f54134"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-85aa5186-5fb4-4ba6-8097-bb094602998d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85aa5186-5fb4-4ba6-8097-bb094602998d
Content-Type: application/json

--- response: 404 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85aa5186-5fb4-4ba6-8097-bb094602998d
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-85aa5186-5fb4-4ba6-8097-bb094602998d"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-637de44e-1187-456b-9285-d47c7aec39b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-637de44e-1187-456b-9285-d47c7aec39b6
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-637de44e-1187-456b-9285-d47c7aec39b6
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
correlation: qa-f66ccb46-0257-4076-9046-a3a7fd5d7ba4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f66ccb46-0257-4076-9046-a3a7fd5d7ba4
Content-Type: application/json

--- request body ---
{"handle":"qa-2f1f7ef08434","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f66ccb46-0257-4076-9046-a3a7fd5d7ba4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f66ccb46-0257-4076-9046-a3a7fd5d7ba4"}
```
