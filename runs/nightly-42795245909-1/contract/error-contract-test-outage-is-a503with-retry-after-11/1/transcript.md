# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-671f9078-1980-4f4b-8b05-5ed6b99c71a7` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-57f73b57-c24b-4e79-a1ba-febd53a795ce` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-0c7274f4-dab1-4842-8c51-ac99aa1fdfee` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-6882c6ba-0084-4c80-af9f-424f609e5f47` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 15 | `qa-d99b5de6-8d14-495e-b9b7-583148d4a3bb` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-ede2ecee-037e-471a-a9ae-d897115e64e4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-9ac1bd85-01d0-4946-8723-14f17b9b21fd` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-f8465ca4-693f-4dd2-ac1d-242851148001` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-2d35fb4c-63a2-42a7-8172-ad46301afff4` |
| 10 | `POST /v1/auth/token` | 401 | 33 | `qa-8298c16f-d3ce-4f91-b8e4-b3a3f368bb6b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-671f9078-1980-4f4b-8b05-5ed6b99c71a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-671f9078-1980-4f4b-8b05-5ed6b99c71a7
Content-Type: application/json

--- request body ---
{"handle":"qa-062929d06aae","displayName":"QA 062929d06aae","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-671f9078-1980-4f4b-8b05-5ed6b99c71a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Location: /v1/accounts/qa-062929d06aae
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b905099-c5d0-449f-8c52-13154b7bea6e","handle":"qa-062929d06aae","displayName":"QA 062929d06aae","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.943097755Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-57f73b57-c24b-4e79-a1ba-febd53a795ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57f73b57-c24b-4e79-a1ba-febd53a795ce
Content-Type: application/json

--- request body ---
{"handle":"qa-9f458ccd3d17","displayName":"QA 9f458ccd3d17","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-57f73b57-c24b-4e79-a1ba-febd53a795ce
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
Location: /v1/accounts/qa-9f458ccd3d17
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e20dd616-aaf2-4842-8431-153ca1eb3a0a","handle":"qa-9f458ccd3d17","displayName":"QA 9f458ccd3d17","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.990178478Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0c7274f4-dab1-4842-8c51-ac99aa1fdfee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c7274f4-dab1-4842-8c51-ac99aa1fdfee
Content-Type: application/json

--- request body ---
{"handle":"qa-062929d06aae","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c7274f4-dab1-4842-8c51-ac99aa1fdfee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b905099-c5d0-449f-8c52-13154b7bea6e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6882c6ba-0084-4c80-af9f-424f609e5f47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6882c6ba-0084-4c80-af9f-424f609e5f47
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9f458ccd3d17","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6882c6ba-0084-4c80-af9f-424f609e5f47
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
Location: /v1/conversations/cnv_46fc81d1-efa7-465b-bf0d-2821a8655b1d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_46fc81d1-efa7-465b-bf0d-2821a8655b1d","subject":"Error contract","status":"open","region":"eu","participants":["qa-062929d06aae","qa-9f458ccd3d17"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.035803180Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_46fc81d1-efa7-465b-bf0d-2821a8655b1d/read
correlation: qa-d99b5de6-8d14-495e-b9b7-583148d4a3bb

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 23ad7e19-630e-4abd-8097-27d39b96c5e6
X-Correlation-Id: qa-d99b5de6-8d14-495e-b9b7-583148d4a3bb
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d99b5de6-8d14-495e-b9b7-583148d4a3bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_46fc81d1-efa7-465b-bf0d-2821a8655b1d/read","correlationId":"qa-d99b5de6-8d14-495e-b9b7-583148d4a3bb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ede2ecee-037e-471a-a9ae-d897115e64e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ede2ecee-037e-471a-a9ae-d897115e64e4
Content-Type: application/json

--- request body ---
{"handle":"qa-9f458ccd3d17","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ede2ecee-037e-471a-a9ae-d897115e64e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e20dd616-aaf2-4842-8431-153ca1eb3a0a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9ac1bd85-01d0-4946-8723-14f17b9b21fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ac1bd85-01d0-4946-8723-14f17b9b21fd
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9ac1bd85-01d0-4946-8723-14f17b9b21fd
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
correlation: qa-f8465ca4-693f-4dd2-ac1d-242851148001

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8465ca4-693f-4dd2-ac1d-242851148001
Content-Type: application/json

--- request body ---
{"handle":"qa-9f458ccd3d17","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8465ca4-693f-4dd2-ac1d-242851148001
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f8465ca4-693f-4dd2-ac1d-242851148001"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d35fb4c-63a2-42a7-8172-ad46301afff4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d35fb4c-63a2-42a7-8172-ad46301afff4
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d35fb4c-63a2-42a7-8172-ad46301afff4
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
correlation: qa-8298c16f-d3ce-4f91-b8e4-b3a3f368bb6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8298c16f-d3ce-4f91-b8e4-b3a3f368bb6b
Content-Type: application/json

--- request body ---
{"handle":"qa-062929d06aae","password":"****"}

--- response: 401 in 33 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8298c16f-d3ce-4f91-b8e4-b3a3f368bb6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8298c16f-d3ce-4f91-b8e4-b3a3f368bb6b"}
```
