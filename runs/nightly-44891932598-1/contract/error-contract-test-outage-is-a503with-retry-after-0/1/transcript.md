# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-8f833170-db35-4cce-8969-424ae3592fc4` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-f89e330e-b638-4d36-8ec4-1269892fc1f2` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-43c17203-f5a4-48fa-8efa-75f49baaf027` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-511208e7-4076-4862-a3fe-3d0ebddbd5d6` |
| 5 | `POST /v1/auth/token` | 503 | 44 | `qa-393b4a65-1c44-4be4-8474-002def983dc5` |
| 6 | `POST /v1/auth/token` | 200 | 55 | `qa-4e38d60f-b037-486c-a077-6458bd11dd72` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-e89f9f80-51be-43c7-b5a5-b6b5760e59ca` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-b300cbd8-5e91-4b5c-9547-4005262c2ae3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-e723305e-3878-4d4c-a076-0811b03e067f` |
| 10 | `POST /v1/auth/token` | 401 | 49 | `qa-970f5a1c-4067-4efb-9aad-b7ced414da76` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8f833170-db35-4cce-8969-424ae3592fc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f833170-db35-4cce-8969-424ae3592fc4
Content-Type: application/json

--- request body ---
{"handle":"qa-8ebc6db45b5d","displayName":"QA 8ebc6db45b5d","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f833170-db35-4cce-8969-424ae3592fc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-8ebc6db45b5d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0dc0a195-d218-4551-bfc0-cc8a677861a3","handle":"qa-8ebc6db45b5d","displayName":"QA 8ebc6db45b5d","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.127976371Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f89e330e-b638-4d36-8ec4-1269892fc1f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f89e330e-b638-4d36-8ec4-1269892fc1f2
Content-Type: application/json

--- request body ---
{"handle":"qa-ed3f60a332a5","displayName":"QA ed3f60a332a5","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-f89e330e-b638-4d36-8ec4-1269892fc1f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Location: /v1/accounts/qa-ed3f60a332a5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5c9b8f4f-f8a3-4c62-868b-7b3cb446e9a0","handle":"qa-ed3f60a332a5","displayName":"QA ed3f60a332a5","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.182029482Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-43c17203-f5a4-48fa-8efa-75f49baaf027

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43c17203-f5a4-48fa-8efa-75f49baaf027
Content-Type: application/json

--- request body ---
{"handle":"qa-8ebc6db45b5d","password":"****"}

--- response: 200 in 46 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-43c17203-f5a4-48fa-8efa-75f49baaf027
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0dc0a195-d218-4551-bfc0-cc8a677861a3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-511208e7-4076-4862-a3fe-3d0ebddbd5d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-511208e7-4076-4862-a3fe-3d0ebddbd5d6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ed3f60a332a5","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-511208e7-4076-4862-a3fe-3d0ebddbd5d6
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
Location: /v1/conversations/cnv_7b25b8e6-6553-4449-98f1-958631a85fb5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7b25b8e6-6553-4449-98f1-958631a85fb5","subject":"Error contract","status":"open","region":"eu","participants":["qa-8ebc6db45b5d","qa-ed3f60a332a5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.284955582Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-393b4a65-1c44-4be4-8474-002def983dc5

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 622fa900-fa01-4c04-a199-eab62d6f58ec
X-Correlation-Id: qa-393b4a65-1c44-4be4-8474-002def983dc5
Content-Type: application/json

--- request body ---
{"handle":"qa-8ebc6db45b5d","password":"****"}

--- response: 503 in 44 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-393b4a65-1c44-4be4-8474-002def983dc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-393b4a65-1c44-4be4-8474-002def983dc5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4e38d60f-b037-486c-a077-6458bd11dd72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e38d60f-b037-486c-a077-6458bd11dd72
Content-Type: application/json

--- request body ---
{"handle":"qa-ed3f60a332a5","password":"****"}

--- response: 200 in 55 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e38d60f-b037-486c-a077-6458bd11dd72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5c9b8f4f-f8a3-4c62-868b-7b3cb446e9a0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e89f9f80-51be-43c7-b5a5-b6b5760e59ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e89f9f80-51be-43c7-b5a5-b6b5760e59ca
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e89f9f80-51be-43c7-b5a5-b6b5760e59ca
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
correlation: qa-b300cbd8-5e91-4b5c-9547-4005262c2ae3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b300cbd8-5e91-4b5c-9547-4005262c2ae3
Content-Type: application/json

--- request body ---
{"handle":"qa-ed3f60a332a5","password":"****"}

--- response: 401 in 31 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b300cbd8-5e91-4b5c-9547-4005262c2ae3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b300cbd8-5e91-4b5c-9547-4005262c2ae3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e723305e-3878-4d4c-a076-0811b03e067f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e723305e-3878-4d4c-a076-0811b03e067f
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e723305e-3878-4d4c-a076-0811b03e067f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-970f5a1c-4067-4efb-9aad-b7ced414da76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-970f5a1c-4067-4efb-9aad-b7ced414da76
Content-Type: application/json

--- request body ---
{"handle":"qa-8ebc6db45b5d","password":"****"}

--- response: 401 in 49 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-970f5a1c-4067-4efb-9aad-b7ced414da76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-970f5a1c-4067-4efb-9aad-b7ced414da76"}
```
