# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-9efbd4e3-b499-4b2f-9795-286425576119` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-249c16f2-6fa3-466c-b493-0f370933c881` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-606ece02-57b3-4c42-9644-a3e1e9d807fd` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-b1974c12-1c3e-4ec8-9ea5-68d00a0f66ff` |
| 5 | `POST /v1/conversations` | 422 | 6 | `qa-911db958-0b03-4d02-8ebe-81d0a093f349` |
| 6 | `POST /v1/auth/token` | 200 | 6 | `qa-e3e4d422-3368-4504-8938-b7d57b6734b6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-0c23a014-9244-43f6-967b-2b098e83079e` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-ce9ca759-3a26-41ed-add1-e68eba230a2f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-eca762c3-3c0d-4af2-a190-2d899c89db7d` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-55c0b235-b597-4558-88f0-0c4b458b32c6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9efbd4e3-b499-4b2f-9795-286425576119

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9efbd4e3-b499-4b2f-9795-286425576119
Content-Type: application/json

--- request body ---
{"handle":"qa-a168d1aef308","displayName":"QA a168d1aef308","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9efbd4e3-b499-4b2f-9795-286425576119
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Location: /v1/accounts/qa-a168d1aef308
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a1649e0-7b4d-4edf-8cf5-57eec21199e3","handle":"qa-a168d1aef308","displayName":"QA a168d1aef308","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.351992457Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-249c16f2-6fa3-466c-b493-0f370933c881

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-249c16f2-6fa3-466c-b493-0f370933c881
Content-Type: application/json

--- request body ---
{"handle":"qa-b75f49224c2d","displayName":"QA b75f49224c2d","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-249c16f2-6fa3-466c-b493-0f370933c881
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Location: /v1/accounts/qa-b75f49224c2d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b49df211-7db3-463e-8671-8e5a766bebc8","handle":"qa-b75f49224c2d","displayName":"QA b75f49224c2d","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.388967691Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-606ece02-57b3-4c42-9644-a3e1e9d807fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-606ece02-57b3-4c42-9644-a3e1e9d807fd
Content-Type: application/json

--- request body ---
{"handle":"qa-a168d1aef308","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-606ece02-57b3-4c42-9644-a3e1e9d807fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a1649e0-7b4d-4edf-8cf5-57eec21199e3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b1974c12-1c3e-4ec8-9ea5-68d00a0f66ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1974c12-1c3e-4ec8-9ea5-68d00a0f66ff
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b75f49224c2d","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1974c12-1c3e-4ec8-9ea5-68d00a0f66ff
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
Location: /v1/conversations/cnv_f18869e6-f262-4379-b6fa-014b22e89c1a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f18869e6-f262-4379-b6fa-014b22e89c1a","subject":"Error contract","status":"open","region":"eu","participants":["qa-a168d1aef308","qa-b75f49224c2d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.446175287Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-911db958-0b03-4d02-8ebe-81d0a093f349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-911db958-0b03-4d02-8ebe-81d0a093f349
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b75f49224c2d","subject":" ","message":"Hi"}

--- response: 422 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-911db958-0b03-4d02-8ebe-81d0a093f349
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-911db958-0b03-4d02-8ebe-81d0a093f349","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e3e4d422-3368-4504-8938-b7d57b6734b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3e4d422-3368-4504-8938-b7d57b6734b6
Content-Type: application/json

--- request body ---
{"handle":"qa-b75f49224c2d","password":"****"}

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3e4d422-3368-4504-8938-b7d57b6734b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b49df211-7db3-463e-8671-8e5a766bebc8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c23a014-9244-43f6-967b-2b098e83079e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c23a014-9244-43f6-967b-2b098e83079e
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c23a014-9244-43f6-967b-2b098e83079e
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-ce9ca759-3a26-41ed-add1-e68eba230a2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce9ca759-3a26-41ed-add1-e68eba230a2f
Content-Type: application/json

--- request body ---
{"handle":"qa-b75f49224c2d","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce9ca759-3a26-41ed-add1-e68eba230a2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce9ca759-3a26-41ed-add1-e68eba230a2f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eca762c3-3c0d-4af2-a190-2d899c89db7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eca762c3-3c0d-4af2-a190-2d899c89db7d
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eca762c3-3c0d-4af2-a190-2d899c89db7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-55c0b235-b597-4558-88f0-0c4b458b32c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55c0b235-b597-4558-88f0-0c4b458b32c6
Content-Type: application/json

--- request body ---
{"handle":"qa-a168d1aef308","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55c0b235-b597-4558-88f0-0c4b458b32c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-55c0b235-b597-4558-88f0-0c4b458b32c6"}
```
