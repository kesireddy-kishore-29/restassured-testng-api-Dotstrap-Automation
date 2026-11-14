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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-9227f33d-7fa5-4662-8256-728ea297c47c` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-b29543ca-d024-4b49-ae50-b3b1cb53fe62` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-9c1dc614-ec6d-4c76-aa4d-7f22d595dda0` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-4ed98fe8-b566-4f39-bb0a-c6d141675919` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 9 | `qa-5358486e-f12d-4db5-be40-466c27447c8e` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-f5795431-e843-47fd-8325-d47f5184475b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-2e86f4e6-3a5b-4a92-9d86-29ea7b4b28de` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-09a549d3-af43-4cb3-900f-73c7a3bc259a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-c3d9bab8-16ea-441c-8ac9-41f06e695edb` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-12edc690-9d72-45ae-8539-8b10591baf07` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9227f33d-7fa5-4662-8256-728ea297c47c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9227f33d-7fa5-4662-8256-728ea297c47c
Content-Type: application/json

--- request body ---
{"handle":"qa-0f76f5e7b1ff","displayName":"QA 0f76f5e7b1ff","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9227f33d-7fa5-4662-8256-728ea297c47c
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
Location: /v1/accounts/qa-0f76f5e7b1ff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_989a3a65-fb9b-45a7-8c6b-24d89a0cd2cf","handle":"qa-0f76f5e7b1ff","displayName":"QA 0f76f5e7b1ff","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.984611199Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b29543ca-d024-4b49-ae50-b3b1cb53fe62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b29543ca-d024-4b49-ae50-b3b1cb53fe62
Content-Type: application/json

--- request body ---
{"handle":"qa-bfbcf99e472f","displayName":"QA bfbcf99e472f","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b29543ca-d024-4b49-ae50-b3b1cb53fe62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Location: /v1/accounts/qa-bfbcf99e472f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4379a386-0f2c-4a5f-b8c8-0d603add6567","handle":"qa-bfbcf99e472f","displayName":"QA bfbcf99e472f","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.023017830Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9c1dc614-ec6d-4c76-aa4d-7f22d595dda0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c1dc614-ec6d-4c76-aa4d-7f22d595dda0
Content-Type: application/json

--- request body ---
{"handle":"qa-0f76f5e7b1ff","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c1dc614-ec6d-4c76-aa4d-7f22d595dda0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_989a3a65-fb9b-45a7-8c6b-24d89a0cd2cf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4ed98fe8-b566-4f39-bb0a-c6d141675919

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ed98fe8-b566-4f39-bb0a-c6d141675919
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bfbcf99e472f","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ed98fe8-b566-4f39-bb0a-c6d141675919
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
Location: /v1/conversations/cnv_55b664f4-c140-40be-a140-fd24cfe27570
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_55b664f4-c140-40be-a140-fd24cfe27570","subject":"Error contract","status":"open","region":"eu","participants":["qa-0f76f5e7b1ff","qa-bfbcf99e472f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.099055158Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_55b664f4-c140-40be-a140-fd24cfe27570/read
correlation: qa-5358486e-f12d-4db5-be40-466c27447c8e

--- request headers ---
Accept: application/json
X-Fault-Key: 98b62f1f-0aa2-40e7-a243-38a8d7e85778
X-Fault: unavailable-once
X-Correlation-Id: qa-5358486e-f12d-4db5-be40-466c27447c8e
Content-Type: application/json

--- response: 503 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5358486e-f12d-4db5-be40-466c27447c8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_55b664f4-c140-40be-a140-fd24cfe27570/read","correlationId":"qa-5358486e-f12d-4db5-be40-466c27447c8e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f5795431-e843-47fd-8325-d47f5184475b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5795431-e843-47fd-8325-d47f5184475b
Content-Type: application/json

--- request body ---
{"handle":"qa-bfbcf99e472f","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5795431-e843-47fd-8325-d47f5184475b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4379a386-0f2c-4a5f-b8c8-0d603add6567"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e86f4e6-3a5b-4a92-9d86-29ea7b4b28de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e86f4e6-3a5b-4a92-9d86-29ea7b4b28de
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e86f4e6-3a5b-4a92-9d86-29ea7b4b28de
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
correlation: qa-09a549d3-af43-4cb3-900f-73c7a3bc259a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09a549d3-af43-4cb3-900f-73c7a3bc259a
Content-Type: application/json

--- request body ---
{"handle":"qa-bfbcf99e472f","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09a549d3-af43-4cb3-900f-73c7a3bc259a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09a549d3-af43-4cb3-900f-73c7a3bc259a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c3d9bab8-16ea-441c-8ac9-41f06e695edb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3d9bab8-16ea-441c-8ac9-41f06e695edb
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c3d9bab8-16ea-441c-8ac9-41f06e695edb
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
correlation: qa-12edc690-9d72-45ae-8539-8b10591baf07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12edc690-9d72-45ae-8539-8b10591baf07
Content-Type: application/json

--- request body ---
{"handle":"qa-0f76f5e7b1ff","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-12edc690-9d72-45ae-8539-8b10591baf07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-12edc690-9d72-45ae-8539-8b10591baf07"}
```
