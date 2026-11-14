# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-39fffe62-f5ee-4da4-a7f8-3ac87f5fbcc7` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-71dac6c3-4dde-4e4b-86d3-e9f33e883e88` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-8e626dbb-b1d4-474c-b44b-11a5f69741c3` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-c75b70b8-dd29-4bb8-88a5-9f9d43e8bb70` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 22 | `qa-dc798627-acb2-464f-8633-9ee1632d6142` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-bbc4b13b-07c0-4a49-90a4-2709a0e85f32` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-3dd1d731-11a2-4046-b477-793693f59f2d` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-05b4814f-7c2d-4ada-9a74-0a42fde69a37` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-aabe9c58-b129-4b2f-93f7-e7a42ccbf247` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-b0bf9d83-7403-45db-aad2-d5bab40d51ec` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-39fffe62-f5ee-4da4-a7f8-3ac87f5fbcc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39fffe62-f5ee-4da4-a7f8-3ac87f5fbcc7
Content-Type: application/json

--- request body ---
{"handle":"qa-b38492e5faa0","displayName":"QA b38492e5faa0","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-39fffe62-f5ee-4da4-a7f8-3ac87f5fbcc7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 7
Location: /v1/accounts/qa-b38492e5faa0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3e06f828-4af2-49d2-8a38-2c15dafe8bee","handle":"qa-b38492e5faa0","displayName":"QA b38492e5faa0","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.646955719Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-71dac6c3-4dde-4e4b-86d3-e9f33e883e88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71dac6c3-4dde-4e4b-86d3-e9f33e883e88
Content-Type: application/json

--- request body ---
{"handle":"qa-2d5524a65e01","displayName":"QA 2d5524a65e01","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-71dac6c3-4dde-4e4b-86d3-e9f33e883e88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 7
Location: /v1/accounts/qa-2d5524a65e01
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9ba3019-14b7-4ffc-992d-efcbac613a16","handle":"qa-2d5524a65e01","displayName":"QA 2d5524a65e01","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.696911365Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8e626dbb-b1d4-474c-b44b-11a5f69741c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e626dbb-b1d4-474c-b44b-11a5f69741c3
Content-Type: application/json

--- request body ---
{"handle":"qa-b38492e5faa0","password":"****"}

--- response: 200 in 50 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e626dbb-b1d4-474c-b44b-11a5f69741c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3e06f828-4af2-49d2-8a38-2c15dafe8bee"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c75b70b8-dd29-4bb8-88a5-9f9d43e8bb70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c75b70b8-dd29-4bb8-88a5-9f9d43e8bb70
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2d5524a65e01","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c75b70b8-dd29-4bb8-88a5-9f9d43e8bb70
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
Location: /v1/conversations/cnv_0f8a6784-7623-4c33-85c0-9c9d9be1d732
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0f8a6784-7623-4c33-85c0-9c9d9be1d732","subject":"Error contract","status":"open","region":"eu","participants":["qa-b38492e5faa0","qa-2d5524a65e01"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.798017327Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_0f8a6784-7623-4c33-85c0-9c9d9be1d732/messages
correlation: qa-dc798627-acb2-464f-8633-9ee1632d6142

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: a33660df-0e65-484f-a43b-1a2afef44559
X-Correlation-Id: qa-dc798627-acb2-464f-8633-9ee1632d6142
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc798627-acb2-464f-8633-9ee1632d6142
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_0f8a6784-7623-4c33-85c0-9c9d9be1d732/messages","correlationId":"qa-dc798627-acb2-464f-8633-9ee1632d6142"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bbc4b13b-07c0-4a49-90a4-2709a0e85f32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbc4b13b-07c0-4a49-90a4-2709a0e85f32
Content-Type: application/json

--- request body ---
{"handle":"qa-2d5524a65e01","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbc4b13b-07c0-4a49-90a4-2709a0e85f32
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a9ba3019-14b7-4ffc-992d-efcbac613a16"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3dd1d731-11a2-4046-b477-793693f59f2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dd1d731-11a2-4046-b477-793693f59f2d
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3dd1d731-11a2-4046-b477-793693f59f2d
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
correlation: qa-05b4814f-7c2d-4ada-9a74-0a42fde69a37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05b4814f-7c2d-4ada-9a74-0a42fde69a37
Content-Type: application/json

--- request body ---
{"handle":"qa-2d5524a65e01","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05b4814f-7c2d-4ada-9a74-0a42fde69a37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-05b4814f-7c2d-4ada-9a74-0a42fde69a37"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aabe9c58-b129-4b2f-93f7-e7a42ccbf247

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aabe9c58-b129-4b2f-93f7-e7a42ccbf247
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aabe9c58-b129-4b2f-93f7-e7a42ccbf247
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
correlation: qa-b0bf9d83-7403-45db-aad2-d5bab40d51ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0bf9d83-7403-45db-aad2-d5bab40d51ec
Content-Type: application/json

--- request body ---
{"handle":"qa-b38492e5faa0","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0bf9d83-7403-45db-aad2-d5bab40d51ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b0bf9d83-7403-45db-aad2-d5bab40d51ec"}
```
