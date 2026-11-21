# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-5de34558-c45b-4fc0-8491-b60d886127bc` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-a4d19286-7284-42cf-8397-d0d7f32e8a9f` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-d7faadfb-ae82-406a-b336-862f7207ce86` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-ba7df23e-aeb4-4b26-93a4-52cd27521a97` |
| 5 | `GET /v1/admin/stats` | 503 | 16 | `qa-f4928ca9-31b0-4582-b83a-c07f159da020` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-8fcb8078-7311-4818-ace3-f718a7ee8d43` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-3ef6c95c-dba5-4aa5-9092-1bc577e8312a` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-3d1f0c9f-ba97-47ed-86e4-0428099dd12d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-d0d33f75-d72c-408f-a83f-b9dc8f98c264` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-b32b0f8f-da7a-40d4-bee1-f6b93d843581` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5de34558-c45b-4fc0-8491-b60d886127bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5de34558-c45b-4fc0-8491-b60d886127bc
Content-Type: application/json

--- request body ---
{"handle":"qa-82b462a35d31","displayName":"QA 82b462a35d31","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5de34558-c45b-4fc0-8491-b60d886127bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 7
Location: /v1/accounts/qa-82b462a35d31
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b697110b-07b5-4e6e-a273-666da8d67dab","handle":"qa-82b462a35d31","displayName":"QA 82b462a35d31","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.701208687Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a4d19286-7284-42cf-8397-d0d7f32e8a9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4d19286-7284-42cf-8397-d0d7f32e8a9f
Content-Type: application/json

--- request body ---
{"handle":"qa-1c3aaa49fabd","displayName":"QA 1c3aaa49fabd","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4d19286-7284-42cf-8397-d0d7f32e8a9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 7
Location: /v1/accounts/qa-1c3aaa49fabd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ad7a9ee5-a150-44df-b807-4db1c18419c5","handle":"qa-1c3aaa49fabd","displayName":"QA 1c3aaa49fabd","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.730571369Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d7faadfb-ae82-406a-b336-862f7207ce86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7faadfb-ae82-406a-b336-862f7207ce86
Content-Type: application/json

--- request body ---
{"handle":"qa-82b462a35d31","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7faadfb-ae82-406a-b336-862f7207ce86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b697110b-07b5-4e6e-a273-666da8d67dab"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ba7df23e-aeb4-4b26-93a4-52cd27521a97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba7df23e-aeb4-4b26-93a4-52cd27521a97
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1c3aaa49fabd","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba7df23e-aeb4-4b26-93a4-52cd27521a97
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
Location: /v1/conversations/cnv_0a920bce-28f5-474b-9362-a4f29c54f7c9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0a920bce-28f5-474b-9362-a4f29c54f7c9","subject":"Error contract","status":"open","region":"eu","participants":["qa-82b462a35d31","qa-1c3aaa49fabd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.788625521Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-f4928ca9-31b0-4582-b83a-c07f159da020

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: a389c16f-6f60-471d-83e5-ffaeaa428af3
X-Correlation-Id: qa-f4928ca9-31b0-4582-b83a-c07f159da020
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4928ca9-31b0-4582-b83a-c07f159da020
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-f4928ca9-31b0-4582-b83a-c07f159da020"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8fcb8078-7311-4818-ace3-f718a7ee8d43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fcb8078-7311-4818-ace3-f718a7ee8d43
Content-Type: application/json

--- request body ---
{"handle":"qa-1c3aaa49fabd","password":"****"}

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fcb8078-7311-4818-ace3-f718a7ee8d43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ad7a9ee5-a150-44df-b807-4db1c18419c5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3ef6c95c-dba5-4aa5-9092-1bc577e8312a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ef6c95c-dba5-4aa5-9092-1bc577e8312a
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3ef6c95c-dba5-4aa5-9092-1bc577e8312a
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
correlation: qa-3d1f0c9f-ba97-47ed-86e4-0428099dd12d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d1f0c9f-ba97-47ed-86e4-0428099dd12d
Content-Type: application/json

--- request body ---
{"handle":"qa-1c3aaa49fabd","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d1f0c9f-ba97-47ed-86e4-0428099dd12d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d1f0c9f-ba97-47ed-86e4-0428099dd12d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d0d33f75-d72c-408f-a83f-b9dc8f98c264

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0d33f75-d72c-408f-a83f-b9dc8f98c264
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d0d33f75-d72c-408f-a83f-b9dc8f98c264
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
correlation: qa-b32b0f8f-da7a-40d4-bee1-f6b93d843581

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b32b0f8f-da7a-40d4-bee1-f6b93d843581
Content-Type: application/json

--- request body ---
{"handle":"qa-82b462a35d31","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b32b0f8f-da7a-40d4-bee1-f6b93d843581
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b32b0f8f-da7a-40d4-bee1-f6b93d843581"}
```
