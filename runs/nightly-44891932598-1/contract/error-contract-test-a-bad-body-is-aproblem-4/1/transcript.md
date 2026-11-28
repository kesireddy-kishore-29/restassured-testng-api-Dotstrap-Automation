# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-8fc8b544-5e2e-4ae1-87d8-b3362a128ec9` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-eba5390e-8df3-42be-bc28-5e1bedf12d2f` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-f0fcc452-be30-4e87-a4a3-01367686547e` |
| 4 | `POST /v1/conversations` | 201 | 35 | `qa-466d5fdb-9d59-41dd-bb18-480a2a72c071` |
| 5 | `POST /v1/accounts` | 415 | 21 | `qa-bf3d8d92-da0a-4ccc-86bf-98879b0d801f` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-220aa5e5-f055-458b-b242-fb794d1342e9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-360638e4-9a04-4c2f-9868-4412c539e156` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-2b0b84a5-4377-49d1-9211-8b5dbd591b95` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-7ab89e1e-6beb-40b7-bf83-60183a2311e2` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-660da0ae-62fc-4223-990c-fc43e4ff25ac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8fc8b544-5e2e-4ae1-87d8-b3362a128ec9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fc8b544-5e2e-4ae1-87d8-b3362a128ec9
Content-Type: application/json

--- request body ---
{"handle":"qa-cf37d184fbf1","displayName":"QA cf37d184fbf1","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fc8b544-5e2e-4ae1-87d8-b3362a128ec9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 7
Location: /v1/accounts/qa-cf37d184fbf1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ea2bf51f-18b6-48a5-bdfc-dca80b3ad135","handle":"qa-cf37d184fbf1","displayName":"QA cf37d184fbf1","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.927473869Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eba5390e-8df3-42be-bc28-5e1bedf12d2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eba5390e-8df3-42be-bc28-5e1bedf12d2f
Content-Type: application/json

--- request body ---
{"handle":"qa-a8ca91861d90","displayName":"QA a8ca91861d90","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-eba5390e-8df3-42be-bc28-5e1bedf12d2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 7
Location: /v1/accounts/qa-a8ca91861d90
X-Served-Region: eu
Content-Length: 181

{"id":"acc_54c5a43d-fada-4238-abcd-2e034af829bb","handle":"qa-a8ca91861d90","displayName":"QA a8ca91861d90","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.008689137Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f0fcc452-be30-4e87-a4a3-01367686547e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0fcc452-be30-4e87-a4a3-01367686547e
Content-Type: application/json

--- request body ---
{"handle":"qa-cf37d184fbf1","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0fcc452-be30-4e87-a4a3-01367686547e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ea2bf51f-18b6-48a5-bdfc-dca80b3ad135"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-466d5fdb-9d59-41dd-bb18-480a2a72c071

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-466d5fdb-9d59-41dd-bb18-480a2a72c071
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a8ca91861d90","subject":"Error contract","message":"Hi"}

--- response: 201 in 35 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-466d5fdb-9d59-41dd-bb18-480a2a72c071
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
Location: /v1/conversations/cnv_8999fb2e-243a-4829-a85f-7a5be55273a2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8999fb2e-243a-4829-a85f-7a5be55273a2","subject":"Error contract","status":"open","region":"eu","participants":["qa-cf37d184fbf1","qa-a8ca91861d90"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.138821748Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-bf3d8d92-da0a-4ccc-86bf-98879b0d801f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf3d8d92-da0a-4ccc-86bf-98879b0d801f
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf3d8d92-da0a-4ccc-86bf-98879b0d801f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 7
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-bf3d8d92-da0a-4ccc-86bf-98879b0d801f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-220aa5e5-f055-458b-b242-fb794d1342e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-220aa5e5-f055-458b-b242-fb794d1342e9
Content-Type: application/json

--- request body ---
{"handle":"qa-a8ca91861d90","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-220aa5e5-f055-458b-b242-fb794d1342e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54c5a43d-fada-4238-abcd-2e034af829bb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-360638e4-9a04-4c2f-9868-4412c539e156

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-360638e4-9a04-4c2f-9868-4412c539e156
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-360638e4-9a04-4c2f-9868-4412c539e156
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
correlation: qa-2b0b84a5-4377-49d1-9211-8b5dbd591b95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b0b84a5-4377-49d1-9211-8b5dbd591b95
Content-Type: application/json

--- request body ---
{"handle":"qa-a8ca91861d90","password":"****"}

--- response: 401 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b0b84a5-4377-49d1-9211-8b5dbd591b95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b0b84a5-4377-49d1-9211-8b5dbd591b95"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7ab89e1e-6beb-40b7-bf83-60183a2311e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ab89e1e-6beb-40b7-bf83-60183a2311e2
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7ab89e1e-6beb-40b7-bf83-60183a2311e2
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-660da0ae-62fc-4223-990c-fc43e4ff25ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-660da0ae-62fc-4223-990c-fc43e4ff25ac
Content-Type: application/json

--- request body ---
{"handle":"qa-cf37d184fbf1","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-660da0ae-62fc-4223-990c-fc43e4ff25ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-660da0ae-62fc-4223-990c-fc43e4ff25ac"}
```
