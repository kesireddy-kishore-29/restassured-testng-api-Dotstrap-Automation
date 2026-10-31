# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-33b94f11-e153-4bc3-85f1-7525363c2590` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-73860ba9-a88c-4e5d-984a-1c5d39521d8e` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-07d7ef73-ea75-493a-ae56-9c5cd0ff1580` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-7ec8d8f9-1130-4c49-b43f-c7abc46d5e60` |
| 5 | `GET /v1/credits/balance` | 503 | 16 | `qa-edc64a2b-e9a3-464d-b4ef-daee740aa045` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-e0c06eb7-0ae1-47af-a3fa-badb2980a269` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-d3f5d707-6cb1-44bd-8201-ae8bdf73e812` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-27b5b8a1-b895-4d18-b397-5aa7b77babc3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-7cfd700a-95c7-4640-9fd3-21724b404447` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-965c74cb-26e7-4115-9b81-5dc960ecea76` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-33b94f11-e153-4bc3-85f1-7525363c2590

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33b94f11-e153-4bc3-85f1-7525363c2590
Content-Type: application/json

--- request body ---
{"handle":"qa-d9dbeb23df77","displayName":"QA d9dbeb23df77","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-33b94f11-e153-4bc3-85f1-7525363c2590
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
Location: /v1/accounts/qa-d9dbeb23df77
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0848067f-12ea-44f8-b0f1-6802b1d67b4d","handle":"qa-d9dbeb23df77","displayName":"QA d9dbeb23df77","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.016934754Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-73860ba9-a88c-4e5d-984a-1c5d39521d8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73860ba9-a88c-4e5d-984a-1c5d39521d8e
Content-Type: application/json

--- request body ---
{"handle":"qa-da8279fce363","displayName":"QA da8279fce363","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-73860ba9-a88c-4e5d-984a-1c5d39521d8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 8
Location: /v1/accounts/qa-da8279fce363
X-Served-Region: eu
Content-Length: 181

{"id":"acc_722d0234-2b6f-4362-bcd4-188f35bdb096","handle":"qa-da8279fce363","displayName":"QA da8279fce363","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.053523700Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-07d7ef73-ea75-493a-ae56-9c5cd0ff1580

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07d7ef73-ea75-493a-ae56-9c5cd0ff1580
Content-Type: application/json

--- request body ---
{"handle":"qa-d9dbeb23df77","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-07d7ef73-ea75-493a-ae56-9c5cd0ff1580
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0848067f-12ea-44f8-b0f1-6802b1d67b4d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7ec8d8f9-1130-4c49-b43f-c7abc46d5e60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ec8d8f9-1130-4c49-b43f-c7abc46d5e60
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-da8279fce363","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ec8d8f9-1130-4c49-b43f-c7abc46d5e60
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
Location: /v1/conversations/cnv_e981df8f-95fd-4f59-8c57-6064807b724d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e981df8f-95fd-4f59-8c57-6064807b724d","subject":"Error contract","status":"open","region":"eu","participants":["qa-d9dbeb23df77","qa-da8279fce363"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:53.098609788Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-edc64a2b-e9a3-464d-b4ef-daee740aa045

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 5032feb4-5a76-4dcc-9588-162fbb758cda
X-Correlation-Id: qa-edc64a2b-e9a3-464d-b4ef-daee740aa045
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-edc64a2b-e9a3-464d-b4ef-daee740aa045
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-edc64a2b-e9a3-464d-b4ef-daee740aa045"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e0c06eb7-0ae1-47af-a3fa-badb2980a269

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0c06eb7-0ae1-47af-a3fa-badb2980a269
Content-Type: application/json

--- request body ---
{"handle":"qa-da8279fce363","password":"****"}

--- response: 200 in 46 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0c06eb7-0ae1-47af-a3fa-badb2980a269
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_722d0234-2b6f-4362-bcd4-188f35bdb096"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d3f5d707-6cb1-44bd-8201-ae8bdf73e812

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3f5d707-6cb1-44bd-8201-ae8bdf73e812
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d3f5d707-6cb1-44bd-8201-ae8bdf73e812
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
correlation: qa-27b5b8a1-b895-4d18-b397-5aa7b77babc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27b5b8a1-b895-4d18-b397-5aa7b77babc3
Content-Type: application/json

--- request body ---
{"handle":"qa-da8279fce363","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27b5b8a1-b895-4d18-b397-5aa7b77babc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-27b5b8a1-b895-4d18-b397-5aa7b77babc3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7cfd700a-95c7-4640-9fd3-21724b404447

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cfd700a-95c7-4640-9fd3-21724b404447
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7cfd700a-95c7-4640-9fd3-21724b404447
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
correlation: qa-965c74cb-26e7-4115-9b81-5dc960ecea76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-965c74cb-26e7-4115-9b81-5dc960ecea76
Content-Type: application/json

--- request body ---
{"handle":"qa-d9dbeb23df77","password":"****"}

--- response: 401 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-965c74cb-26e7-4115-9b81-5dc960ecea76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-965c74cb-26e7-4115-9b81-5dc960ecea76"}
```
