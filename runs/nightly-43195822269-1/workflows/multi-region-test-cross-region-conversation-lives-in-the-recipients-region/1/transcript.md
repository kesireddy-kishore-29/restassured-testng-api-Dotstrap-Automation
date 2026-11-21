# Transcript: A cross-region conversation is stored in the recipient's region, for both sides

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#crossRegionConversationLivesInTheRecipientsRegion` |
| Features | FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 413 | `qa-b35a8094-9c5f-48b3-8c47-641371699ae0` |
| 2 | `POST /v1/accounts` | 201 | 59 | `qa-87fa99c6-a94a-4b8b-a47f-29c339cb9d87` |
| 3 | `POST /v1/auth/token` | 200 | 76 | `qa-2233a7f8-319f-4ed1-8d58-a16778f138ef` |
| 4 | `POST /v1/conversations` | 201 | 117 | `qa-d402a454-5991-4382-b531-8f4e2963c71e` |
| 5 | `GET /v1/conversations/{id}` | 200 | 26 | `qa-584acbfe-2164-450d-a8e4-94e89e5a8dd8` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-4677799b-e7b6-43e9-8578-a0fe8ef02adc` |
| 7 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-79a6982e-1401-4913-9b9f-991ecd062d11` |
| 8 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-346648e7-91ed-44f5-9fce-9d96f1cdd787` |
| 9 | `POST /v1/auth/token` | 401 | 45 | `qa-da4c058c-f15c-4024-89cf-f7ef834f1249` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-45e1f477-d2be-49cf-9597-89fd5ec9b7d4` |
| 11 | `POST /v1/auth/token` | 401 | 15 | `qa-5b31b7eb-8c00-46fd-883c-a3b585ced1ab` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b35a8094-9c5f-48b3-8c47-641371699ae0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b35a8094-9c5f-48b3-8c47-641371699ae0
Content-Type: application/json

--- request body ---
{"handle":"qa-35c2ce873304","displayName":"QA 35c2ce873304","password":"****","region":"in"}

--- response: 201 in 413 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b35a8094-9c5f-48b3-8c47-641371699ae0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-35c2ce873304
X-Served-Region: in
Content-Length: 181

{"id":"acc_653841aa-fdd9-440f-b5f1-e133d943f5c0","handle":"qa-35c2ce873304","displayName":"QA 35c2ce873304","region":"in","role":"user","createdAt":"2026-11-12T09:56:36.677628148Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-87fa99c6-a94a-4b8b-a47f-29c339cb9d87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87fa99c6-a94a-4b8b-a47f-29c339cb9d87
Content-Type: application/json

--- request body ---
{"handle":"qa-e65e35ccf226","displayName":"QA e65e35ccf226","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-87fa99c6-a94a-4b8b-a47f-29c339cb9d87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-e65e35ccf226
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4aabdb7-d038-4106-9e11-b306d6a6a5bf","handle":"qa-e65e35ccf226","displayName":"QA e65e35ccf226","region":"eu","role":"user","createdAt":"2026-11-12T09:56:37.110351669Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2233a7f8-319f-4ed1-8d58-a16778f138ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2233a7f8-319f-4ed1-8d58-a16778f138ef
Content-Type: application/json

--- request body ---
{"handle":"qa-35c2ce873304","password":"****"}

--- response: 200 in 76 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-2233a7f8-319f-4ed1-8d58-a16778f138ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_653841aa-fdd9-440f-b5f1-e133d943f5c0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d402a454-5991-4382-b531-8f4e2963c71e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d402a454-5991-4382-b531-8f4e2963c71e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e65e35ccf226","subject":"Across regions","message":"Namaste"}

--- response: 201 in 117 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d402a454-5991-4382-b531-8f4e2963c71e
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
X-Served-Region: in
Location: /v1/conversations/cnv_40c6472f-d0b3-413f-9dd7-f5913a86eeaa
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_40c6472f-d0b3-413f-9dd7-f5913a86eeaa","subject":"Across regions","status":"open","region":"eu","participants":["qa-35c2ce873304","qa-e65e35ccf226"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:37.387527310Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_40c6472f-d0b3-413f-9dd7-f5913a86eeaa
correlation: qa-584acbfe-2164-450d-a8e4-94e89e5a8dd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-584acbfe-2164-450d-a8e4-94e89e5a8dd8
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-584acbfe-2164-450d-a8e4-94e89e5a8dd8
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
X-Served-Region: in
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_40c6472f-d0b3-413f-9dd7-f5913a86eeaa","subject":"Across regions","status":"open","region":"eu","participants":["qa-35c2ce873304","qa-e65e35ccf226"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:37.387527310Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4677799b-e7b6-43e9-8578-a0fe8ef02adc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4677799b-e7b6-43e9-8578-a0fe8ef02adc
Content-Type: application/json

--- request body ---
{"handle":"qa-e65e35ccf226","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4677799b-e7b6-43e9-8578-a0fe8ef02adc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4aabdb7-d038-4106-9e11-b306d6a6a5bf"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_40c6472f-d0b3-413f-9dd7-f5913a86eeaa
correlation: qa-79a6982e-1401-4913-9b9f-991ecd062d11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79a6982e-1401-4913-9b9f-991ecd062d11
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-79a6982e-1401-4913-9b9f-991ecd062d11
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_40c6472f-d0b3-413f-9dd7-f5913a86eeaa","subject":"Across regions","status":"open","region":"eu","participants":["qa-35c2ce873304","qa-e65e35ccf226"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-12T09:56:37.387527310Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-346648e7-91ed-44f5-9fce-9d96f1cdd787

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-346648e7-91ed-44f5-9fce-9d96f1cdd787
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-346648e7-91ed-44f5-9fce-9d96f1cdd787
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
correlation: qa-da4c058c-f15c-4024-89cf-f7ef834f1249

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da4c058c-f15c-4024-89cf-f7ef834f1249
Content-Type: application/json

--- request body ---
{"handle":"qa-e65e35ccf226","password":"****"}

--- response: 401 in 45 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da4c058c-f15c-4024-89cf-f7ef834f1249
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-da4c058c-f15c-4024-89cf-f7ef834f1249"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-45e1f477-d2be-49cf-9597-89fd5ec9b7d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45e1f477-d2be-49cf-9597-89fd5ec9b7d4
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-45e1f477-d2be-49cf-9597-89fd5ec9b7d4
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
X-Served-Region: in
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-5b31b7eb-8c00-46fd-883c-a3b585ced1ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b31b7eb-8c00-46fd-883c-a3b585ced1ab
Content-Type: application/json

--- request body ---
{"handle":"qa-35c2ce873304","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b31b7eb-8c00-46fd-883c-a3b585ced1ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b31b7eb-8c00-46fd-883c-a3b585ced1ab"}
```
