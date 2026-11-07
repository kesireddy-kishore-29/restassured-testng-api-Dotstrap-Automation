# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 367 | `qa-b0c61098-1338-48ed-a981-edbfc6d04ab6` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-bbb830aa-7fe7-4cb8-a112-472033456fd7` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-7652e505-ae81-4539-9e0c-9803bd400f44` |
| 4 | `POST /v1/conversations` | 201 | 66 | `qa-c7e915ec-1712-4922-b7ca-7ea42d19fa39` |
| 5 | `GET /v1/accounts/me` | 503 | 31 | `qa-173fc95f-ccea-4940-9fb6-6b7068396603` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-fbbb754d-0b68-441e-8575-15abc89c84c1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-6afab98b-ad11-4848-a082-123fd5c08d0c` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-8e4abac8-89ff-426e-ab1e-500979193126` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-1f1b129f-32f8-4065-b9f8-a759686b3731` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-a5825b4c-deda-4f6f-a26e-70a35d4d2006` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b0c61098-1338-48ed-a981-edbfc6d04ab6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0c61098-1338-48ed-a981-edbfc6d04ab6
Content-Type: application/json

--- request body ---
{"handle":"qa-c606ce955c5f","displayName":"QA c606ce955c5f","password":"****","region":"eu"}

--- response: 201 in 367 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0c61098-1338-48ed-a981-edbfc6d04ab6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-c606ce955c5f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1bb9bcee-9045-4938-a132-1d908219f9b6","handle":"qa-c606ce955c5f","displayName":"QA c606ce955c5f","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.630611856Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bbb830aa-7fe7-4cb8-a112-472033456fd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbb830aa-7fe7-4cb8-a112-472033456fd7
Content-Type: application/json

--- request body ---
{"handle":"qa-6a270604572c","displayName":"QA 6a270604572c","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Mon, 02 Nov 2026 09:38:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbb830aa-7fe7-4cb8-a112-472033456fd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-6a270604572c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5245babd-6184-41d1-af63-c22dcff0896d","handle":"qa-6a270604572c","displayName":"QA 6a270604572c","region":"eu","role":"user","createdAt":"2026-11-02T09:38:34.964019706Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7652e505-ae81-4539-9e0c-9803bd400f44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7652e505-ae81-4539-9e0c-9803bd400f44
Content-Type: application/json

--- request body ---
{"handle":"qa-c606ce955c5f","password":"****"}

--- response: 200 in 42 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7652e505-ae81-4539-9e0c-9803bd400f44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1bb9bcee-9045-4938-a132-1d908219f9b6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c7e915ec-1712-4922-b7ca-7ea42d19fa39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7e915ec-1712-4922-b7ca-7ea42d19fa39
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6a270604572c","subject":"Error contract","message":"Hi"}

--- response: 201 in 66 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7e915ec-1712-4922-b7ca-7ea42d19fa39
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
Location: /v1/conversations/cnv_529f9c0a-f9f1-4f8d-80df-c8af5ee652cd
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_529f9c0a-f9f1-4f8d-80df-c8af5ee652cd","subject":"Error contract","status":"open","region":"eu","participants":["qa-c606ce955c5f","qa-6a270604572c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:35.188317512Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-173fc95f-ccea-4940-9fb6-6b7068396603

--- request headers ---
Accept: application/json
X-Fault-Key: beb2da6d-5bbf-4ce9-b92a-b04b6d4c6e46
X-Fault: unavailable-once
X-Correlation-Id: qa-173fc95f-ccea-4940-9fb6-6b7068396603
Content-Type: application/json

--- response: 503 in 31 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-173fc95f-ccea-4940-9fb6-6b7068396603
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-173fc95f-ccea-4940-9fb6-6b7068396603"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fbbb754d-0b68-441e-8575-15abc89c84c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbbb754d-0b68-441e-8575-15abc89c84c1
Content-Type: application/json

--- request body ---
{"handle":"qa-6a270604572c","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbbb754d-0b68-441e-8575-15abc89c84c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5245babd-6184-41d1-af63-c22dcff0896d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6afab98b-ad11-4848-a082-123fd5c08d0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6afab98b-ad11-4848-a082-123fd5c08d0c
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6afab98b-ad11-4848-a082-123fd5c08d0c
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
correlation: qa-8e4abac8-89ff-426e-ab1e-500979193126

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e4abac8-89ff-426e-ab1e-500979193126
Content-Type: application/json

--- request body ---
{"handle":"qa-6a270604572c","password":"****"}

--- response: 401 in 31 ms ---
Date: Mon, 02 Nov 2026 09:38:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e4abac8-89ff-426e-ab1e-500979193126
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8e4abac8-89ff-426e-ab1e-500979193126"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1f1b129f-32f8-4065-b9f8-a759686b3731

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f1b129f-32f8-4065-b9f8-a759686b3731
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1f1b129f-32f8-4065-b9f8-a759686b3731
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
correlation: qa-a5825b4c-deda-4f6f-a26e-70a35d4d2006

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5825b4c-deda-4f6f-a26e-70a35d4d2006
Content-Type: application/json

--- request body ---
{"handle":"qa-c606ce955c5f","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5825b4c-deda-4f6f-a26e-70a35d4d2006
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5825b4c-deda-4f6f-a26e-70a35d4d2006"}
```
