# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-6c4b4c30-3950-4a7b-8b53-fd7a5abafda8` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-b18f2487-e5db-4894-9907-c985c047d7eb` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-3f29a845-31c7-4cc0-a502-4bc38d86ce2c` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-f9b5e70c-c6a0-4e47-af72-cba4e4d25630` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 18 | `qa-d92b0943-8660-413f-9ec1-9e1d4b3b4309` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-5a2162f0-6da2-4768-baef-7bcf24cc7520` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-6d325d45-4035-4cd3-911d-7e2277faf716` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-619df19e-d758-4ea9-8b59-7b7c7c301eb2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-afefff5d-c789-4ab2-976f-7a4abaa6034f` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-63a8c25b-2a16-4a15-8897-1cb21f54bebb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6c4b4c30-3950-4a7b-8b53-fd7a5abafda8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c4b4c30-3950-4a7b-8b53-fd7a5abafda8
Content-Type: application/json

--- request body ---
{"handle":"qa-201ee2d383c9","displayName":"QA 201ee2d383c9","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c4b4c30-3950-4a7b-8b53-fd7a5abafda8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 9
Location: /v1/accounts/qa-201ee2d383c9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_11024925-bf48-481d-afe3-9286c88c384a","handle":"qa-201ee2d383c9","displayName":"QA 201ee2d383c9","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.958942562Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b18f2487-e5db-4894-9907-c985c047d7eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b18f2487-e5db-4894-9907-c985c047d7eb
Content-Type: application/json

--- request body ---
{"handle":"qa-e15ab96d4618","displayName":"QA e15ab96d4618","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b18f2487-e5db-4894-9907-c985c047d7eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Location: /v1/accounts/qa-e15ab96d4618
X-Served-Region: eu
Content-Length: 181

{"id":"acc_71970886-1c0d-4e16-8a20-062affaaf8c7","handle":"qa-e15ab96d4618","displayName":"QA e15ab96d4618","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.976334705Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3f29a845-31c7-4cc0-a502-4bc38d86ce2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f29a845-31c7-4cc0-a502-4bc38d86ce2c
Content-Type: application/json

--- request body ---
{"handle":"qa-201ee2d383c9","password":"****"}

--- response: 200 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f29a845-31c7-4cc0-a502-4bc38d86ce2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11024925-bf48-481d-afe3-9286c88c384a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f9b5e70c-c6a0-4e47-af72-cba4e4d25630

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9b5e70c-c6a0-4e47-af72-cba4e4d25630
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e15ab96d4618","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9b5e70c-c6a0-4e47-af72-cba4e4d25630
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
Location: /v1/conversations/cnv_e08a2d23-11c8-440e-95f8-2d5017c0c440
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e08a2d23-11c8-440e-95f8-2d5017c0c440","subject":"Error contract","status":"open","region":"eu","participants":["qa-201ee2d383c9","qa-e15ab96d4618"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.029449549Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_e08a2d23-11c8-440e-95f8-2d5017c0c440/messages
correlation: qa-d92b0943-8660-413f-9ec1-9e1d4b3b4309

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9bc0b393-39a2-4574-b759-0254f92f12d0
X-Correlation-Id: qa-d92b0943-8660-413f-9ec1-9e1d4b3b4309
Content-Type: application/json

--- response: 503 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d92b0943-8660-413f-9ec1-9e1d4b3b4309
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_e08a2d23-11c8-440e-95f8-2d5017c0c440/messages","correlationId":"qa-d92b0943-8660-413f-9ec1-9e1d4b3b4309"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5a2162f0-6da2-4768-baef-7bcf24cc7520

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a2162f0-6da2-4768-baef-7bcf24cc7520
Content-Type: application/json

--- request body ---
{"handle":"qa-e15ab96d4618","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a2162f0-6da2-4768-baef-7bcf24cc7520
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_71970886-1c0d-4e16-8a20-062affaaf8c7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d325d45-4035-4cd3-911d-7e2277faf716

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d325d45-4035-4cd3-911d-7e2277faf716
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d325d45-4035-4cd3-911d-7e2277faf716
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
correlation: qa-619df19e-d758-4ea9-8b59-7b7c7c301eb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-619df19e-d758-4ea9-8b59-7b7c7c301eb2
Content-Type: application/json

--- request body ---
{"handle":"qa-e15ab96d4618","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-619df19e-d758-4ea9-8b59-7b7c7c301eb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-619df19e-d758-4ea9-8b59-7b7c7c301eb2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-afefff5d-c789-4ab2-976f-7a4abaa6034f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afefff5d-c789-4ab2-976f-7a4abaa6034f
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-afefff5d-c789-4ab2-976f-7a4abaa6034f
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
correlation: qa-63a8c25b-2a16-4a15-8897-1cb21f54bebb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63a8c25b-2a16-4a15-8897-1cb21f54bebb
Content-Type: application/json

--- request body ---
{"handle":"qa-201ee2d383c9","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63a8c25b-2a16-4a15-8897-1cb21f54bebb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-63a8c25b-2a16-4a15-8897-1cb21f54bebb"}
```
