# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-975b29c5-bb01-4f4d-8d3d-f373f62ad05c` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-e2c307a8-8a4d-464b-87e3-665028917084` |
| 3 | `POST /v1/accounts` | 201 | 70 | `qa-2355c9b2-3f43-450e-955f-4e48ec511d31` |
| 4 | `POST /v1/auth/token` | 200 | 41 | `qa-9abecf71-7239-48d3-a45e-c4d4579bda38` |
| 5 | `POST /v1/conversations` | 201 | 22 | `qa-346e1ec9-7847-4694-aa7d-f3894725c6ed` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-7c17305f-bef7-4c63-aa9a-55566a76340e` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 28 | `qa-a705814a-1a36-4d32-a7fc-3734b351159b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-241778c0-8459-4813-824e-f43a291dbded` |
| 9 | `POST /v1/auth/token` | 401 | 17 | `qa-bf0464e6-76fd-4ab1-9de8-db9ad692dbee` |
| 10 | `POST /v1/auth/token` | 200 | 32 | `qa-a814cb25-4350-4f0c-9fde-868ba8743a30` |
| 11 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-4d497f48-b9d1-4ae4-8dbb-4b34f4b068a8` |
| 12 | `POST /v1/auth/token` | 401 | 13 | `qa-a88c0b54-59a6-407b-84a7-da17adbf269f` |
| 13 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-069766e2-65c7-47a5-b738-5db9cf57b7e7` |
| 14 | `POST /v1/auth/token` | 401 | 28 | `qa-aa456fe9-d165-4de3-a42b-c7d926b5874f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-975b29c5-bb01-4f4d-8d3d-f373f62ad05c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-975b29c5-bb01-4f4d-8d3d-f373f62ad05c
Content-Type: application/json

--- request body ---
{"handle":"qa-af6b048cef48","displayName":"QA af6b048cef48","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-975b29c5-bb01-4f4d-8d3d-f373f62ad05c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Location: /v1/accounts/qa-af6b048cef48
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e7c0d3b-a043-424b-872a-cd4242824aff","handle":"qa-af6b048cef48","displayName":"QA af6b048cef48","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.366420277Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e2c307a8-8a4d-464b-87e3-665028917084

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2c307a8-8a4d-464b-87e3-665028917084
Content-Type: application/json

--- request body ---
{"handle":"qa-26f9e3cc7b16","displayName":"QA 26f9e3cc7b16","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2c307a8-8a4d-464b-87e3-665028917084
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Location: /v1/accounts/qa-26f9e3cc7b16
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3e7ade89-476e-4433-bc40-deebcb5601db","handle":"qa-26f9e3cc7b16","displayName":"QA 26f9e3cc7b16","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.438162329Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-2355c9b2-3f43-450e-955f-4e48ec511d31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2355c9b2-3f43-450e-955f-4e48ec511d31
Content-Type: application/json

--- request body ---
{"handle":"qa-a58108c219f9","displayName":"QA a58108c219f9","password":"****","region":"eu"}

--- response: 201 in 70 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-2355c9b2-3f43-450e-955f-4e48ec511d31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Location: /v1/accounts/qa-a58108c219f9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30594d13-ef8b-4345-bd7e-e83c9fad4a62","handle":"qa-a58108c219f9","displayName":"QA a58108c219f9","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.496634340Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-9abecf71-7239-48d3-a45e-c4d4579bda38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9abecf71-7239-48d3-a45e-c4d4579bda38
Content-Type: application/json

--- request body ---
{"handle":"qa-af6b048cef48","password":"****"}

--- response: 200 in 41 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-9abecf71-7239-48d3-a45e-c4d4579bda38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e7c0d3b-a043-424b-872a-cd4242824aff"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-346e1ec9-7847-4694-aa7d-f3894725c6ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-346e1ec9-7847-4694-aa7d-f3894725c6ed
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-26f9e3cc7b16","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-346e1ec9-7847-4694-aa7d-f3894725c6ed
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
Location: /v1/conversations/cnv_32550900-e2e4-4604-a987-a64c20ff0652
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_32550900-e2e4-4604-a987-a64c20ff0652","subject":"Error contract","status":"open","region":"eu","participants":["qa-af6b048cef48","qa-26f9e3cc7b16"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:22.632897044Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7c17305f-bef7-4c63-aa9a-55566a76340e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c17305f-bef7-4c63-aa9a-55566a76340e
Content-Type: application/json

--- request body ---
{"handle":"qa-a58108c219f9","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c17305f-bef7-4c63-aa9a-55566a76340e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30594d13-ef8b-4345-bd7e-e83c9fad4a62"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_32550900-e2e4-4604-a987-a64c20ff0652/close
correlation: qa-a705814a-1a36-4d32-a7fc-3734b351159b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a705814a-1a36-4d32-a7fc-3734b351159b
Content-Type: application/json

--- response: 403 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a705814a-1a36-4d32-a7fc-3734b351159b
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_32550900-e2e4-4604-a987-a64c20ff0652/close","correlationId":"qa-a705814a-1a36-4d32-a7fc-3734b351159b"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-241778c0-8459-4813-824e-f43a291dbded

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-241778c0-8459-4813-824e-f43a291dbded
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-241778c0-8459-4813-824e-f43a291dbded
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-bf0464e6-76fd-4ab1-9de8-db9ad692dbee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf0464e6-76fd-4ab1-9de8-db9ad692dbee
Content-Type: application/json

--- request body ---
{"handle":"qa-a58108c219f9","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf0464e6-76fd-4ab1-9de8-db9ad692dbee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf0464e6-76fd-4ab1-9de8-db9ad692dbee"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-a814cb25-4350-4f0c-9fde-868ba8743a30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a814cb25-4350-4f0c-9fde-868ba8743a30
Content-Type: application/json

--- request body ---
{"handle":"qa-26f9e3cc7b16","password":"****"}

--- response: 200 in 32 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-a814cb25-4350-4f0c-9fde-868ba8743a30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3e7ade89-476e-4433-bc40-deebcb5601db"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4d497f48-b9d1-4ae4-8dbb-4b34f4b068a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d497f48-b9d1-4ae4-8dbb-4b34f4b068a8
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4d497f48-b9d1-4ae4-8dbb-4b34f4b068a8
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-a88c0b54-59a6-407b-84a7-da17adbf269f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a88c0b54-59a6-407b-84a7-da17adbf269f
Content-Type: application/json

--- request body ---
{"handle":"qa-26f9e3cc7b16","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a88c0b54-59a6-407b-84a7-da17adbf269f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a88c0b54-59a6-407b-84a7-da17adbf269f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-069766e2-65c7-47a5-b738-5db9cf57b7e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-069766e2-65c7-47a5-b738-5db9cf57b7e7
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-069766e2-65c7-47a5-b738-5db9cf57b7e7
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-aa456fe9-d165-4de3-a42b-c7d926b5874f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa456fe9-d165-4de3-a42b-c7d926b5874f
Content-Type: application/json

--- request body ---
{"handle":"qa-af6b048cef48","password":"****"}

--- response: 401 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa456fe9-d165-4de3-a42b-c7d926b5874f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa456fe9-d165-4de3-a42b-c7d926b5874f"}
```
