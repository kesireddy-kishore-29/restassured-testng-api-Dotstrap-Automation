# Transcript: The administrator gets the service statistics

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#theAdministratorGetsTheStatistics` |
| Features | FEAT-AUTHZ-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-1054479a-d093-467e-aaad-2517d912d027` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-57129baa-55f1-475c-83ab-4438fe943ce8` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-996282bb-8419-4ee2-bd58-4d146247df66` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-878ec931-c9c4-4588-94d7-633b2657e339` |
| 5 | `POST /v1/auth/token` | 200 | 33 | `qa-b39a8aec-add4-422f-ba4f-aa43dc934b10` |
| 6 | `GET /v1/admin/stats` | 200 | 40 | `qa-808e4ce1-f926-496a-9216-133e6a8962fc` |
| 7 | `POST /v1/auth/token` | 200 | 17 | `qa-b0aa854b-6bce-4d4b-97fc-a25b39601c8f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-c746fcb3-12ec-416f-a94b-d74ca03ee670` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-5359ff27-c646-4767-bf75-ce0d35e5ba0f` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-7b3de76d-ffdc-44ae-8952-a369683c16ab` |
| 11 | `POST /v1/auth/token` | 401 | 4 | `qa-dac25a7d-85dd-4ae4-b3f6-3bc5efab3c5c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1054479a-d093-467e-aaad-2517d912d027

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1054479a-d093-467e-aaad-2517d912d027
Content-Type: application/json

--- request body ---
{"handle":"qa-c61d5ad60e87","displayName":"QA c61d5ad60e87","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-1054479a-d093-467e-aaad-2517d912d027
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 7
Location: /v1/accounts/qa-c61d5ad60e87
X-Served-Region: eu
Content-Length: 181

{"id":"acc_18ff0f36-69e2-4645-a58c-1b5ca856b8f8","handle":"qa-c61d5ad60e87","displayName":"QA c61d5ad60e87","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.746566698Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-57129baa-55f1-475c-83ab-4438fe943ce8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57129baa-55f1-475c-83ab-4438fe943ce8
Content-Type: application/json

--- request body ---
{"handle":"qa-c2b9f8e30326","displayName":"QA c2b9f8e30326","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-57129baa-55f1-475c-83ab-4438fe943ce8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 7
Location: /v1/accounts/qa-c2b9f8e30326
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cd134809-401f-4161-944d-b7d80ffbb2ee","handle":"qa-c2b9f8e30326","displayName":"QA c2b9f8e30326","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.775488790Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-996282bb-8419-4ee2-bd58-4d146247df66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-996282bb-8419-4ee2-bd58-4d146247df66
Content-Type: application/json

--- request body ---
{"handle":"qa-c61d5ad60e87","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-996282bb-8419-4ee2-bd58-4d146247df66
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_18ff0f36-69e2-4645-a58c-1b5ca856b8f8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-878ec931-c9c4-4588-94d7-633b2657e339

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-878ec931-c9c4-4588-94d7-633b2657e339
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c2b9f8e30326","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-878ec931-c9c4-4588-94d7-633b2657e339
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
Location: /v1/conversations/cnv_75c1ccb4-5a90-4576-8521-a0acd2f5b204
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_75c1ccb4-5a90-4576-8521-a0acd2f5b204","subject":"Error contract","status":"open","region":"eu","participants":["qa-c61d5ad60e87","qa-c2b9f8e30326"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.806033911Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b39a8aec-add4-422f-ba4f-aa43dc934b10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b39a8aec-add4-422f-ba4f-aa43dc934b10
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-b39a8aec-add4-422f-ba4f-aa43dc934b10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ebefd294-18da-4dca-890b-6d21403aa27a"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-808e4ce1-f926-496a-9216-133e6a8962fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-808e4ce1-f926-496a-9216-133e6a8962fc
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-808e4ce1-f926-496a-9216-133e6a8962fc
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
Content-Length: 46

{"accounts":9,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-b0aa854b-6bce-4d4b-97fc-a25b39601c8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0aa854b-6bce-4d4b-97fc-a25b39601c8f
Content-Type: application/json

--- request body ---
{"handle":"qa-c2b9f8e30326","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0aa854b-6bce-4d4b-97fc-a25b39601c8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd134809-401f-4161-944d-b7d80ffbb2ee"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c746fcb3-12ec-416f-a94b-d74ca03ee670

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c746fcb3-12ec-416f-a94b-d74ca03ee670
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c746fcb3-12ec-416f-a94b-d74ca03ee670
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-5359ff27-c646-4767-bf75-ce0d35e5ba0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5359ff27-c646-4767-bf75-ce0d35e5ba0f
Content-Type: application/json

--- request body ---
{"handle":"qa-c2b9f8e30326","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5359ff27-c646-4767-bf75-ce0d35e5ba0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5359ff27-c646-4767-bf75-ce0d35e5ba0f"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7b3de76d-ffdc-44ae-8952-a369683c16ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b3de76d-ffdc-44ae-8952-a369683c16ab
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7b3de76d-ffdc-44ae-8952-a369683c16ab
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-dac25a7d-85dd-4ae4-b3f6-3bc5efab3c5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dac25a7d-85dd-4ae4-b3f6-3bc5efab3c5c
Content-Type: application/json

--- request body ---
{"handle":"qa-c61d5ad60e87","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dac25a7d-85dd-4ae4-b3f6-3bc5efab3c5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dac25a7d-85dd-4ae4-b3f6-3bc5efab3c5c"}
```
