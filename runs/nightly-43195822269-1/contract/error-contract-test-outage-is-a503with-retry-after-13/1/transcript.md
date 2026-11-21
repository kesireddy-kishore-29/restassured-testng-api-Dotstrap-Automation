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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-12248ff2-95bf-4be8-8d0c-a9e1b91e52aa` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-52afea5a-ad10-451b-a1f1-b47abd55d1a7` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-f144cd8d-6e52-4a25-aa24-03d8df367b48` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-fec01d91-4d39-4045-93bb-bb18ffe09284` |
| 5 | `GET /v1/credits/balance` | 503 | 10 | `qa-01ce3b8d-0f07-491e-8fd6-0d5d824a8b37` |
| 6 | `POST /v1/auth/token` | 200 | 73 | `qa-60c3b66e-65f1-4986-83c5-42680f1e78c5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b89a8584-1882-4575-9f93-953827ce54d5` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-fa8cf5b4-3669-43ee-bae6-e8263f205591` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-d05aed9d-5661-4ab4-b7ee-31b8ba4455a3` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-84c6cf96-2490-4334-83ed-79e87d972f0e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-12248ff2-95bf-4be8-8d0c-a9e1b91e52aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12248ff2-95bf-4be8-8d0c-a9e1b91e52aa
Content-Type: application/json

--- request body ---
{"handle":"qa-79d8eb3316be","displayName":"QA 79d8eb3316be","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-12248ff2-95bf-4be8-8d0c-a9e1b91e52aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 8
Location: /v1/accounts/qa-79d8eb3316be
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ec8c9aa1-9f7a-4871-9506-ccb5692f15a5","handle":"qa-79d8eb3316be","displayName":"QA 79d8eb3316be","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.828793655Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-52afea5a-ad10-451b-a1f1-b47abd55d1a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52afea5a-ad10-451b-a1f1-b47abd55d1a7
Content-Type: application/json

--- request body ---
{"handle":"qa-fb144826c3ce","displayName":"QA fb144826c3ce","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-52afea5a-ad10-451b-a1f1-b47abd55d1a7
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
Location: /v1/accounts/qa-fb144826c3ce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a184b3df-9c4e-4124-8bff-5de06537148f","handle":"qa-fb144826c3ce","displayName":"QA fb144826c3ce","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.846052757Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f144cd8d-6e52-4a25-aa24-03d8df367b48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f144cd8d-6e52-4a25-aa24-03d8df367b48
Content-Type: application/json

--- request body ---
{"handle":"qa-79d8eb3316be","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f144cd8d-6e52-4a25-aa24-03d8df367b48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ec8c9aa1-9f7a-4871-9506-ccb5692f15a5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fec01d91-4d39-4045-93bb-bb18ffe09284

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fec01d91-4d39-4045-93bb-bb18ffe09284
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fb144826c3ce","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-fec01d91-4d39-4045-93bb-bb18ffe09284
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
Location: /v1/conversations/cnv_9ccd829c-b9c2-4f9c-ab12-5642f51b2a1f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9ccd829c-b9c2-4f9c-ab12-5642f51b2a1f","subject":"Error contract","status":"open","region":"eu","participants":["qa-79d8eb3316be","qa-fb144826c3ce"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.900452759Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-01ce3b8d-0f07-491e-8fd6-0d5d824a8b37

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 3c7eaed7-62b2-41b4-ac5e-b4f67c687295
X-Correlation-Id: qa-01ce3b8d-0f07-491e-8fd6-0d5d824a8b37
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01ce3b8d-0f07-491e-8fd6-0d5d824a8b37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-01ce3b8d-0f07-491e-8fd6-0d5d824a8b37"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-60c3b66e-65f1-4986-83c5-42680f1e78c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60c3b66e-65f1-4986-83c5-42680f1e78c5
Content-Type: application/json

--- request body ---
{"handle":"qa-fb144826c3ce","password":"****"}

--- response: 200 in 73 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-60c3b66e-65f1-4986-83c5-42680f1e78c5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a184b3df-9c4e-4124-8bff-5de06537148f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b89a8584-1882-4575-9f93-953827ce54d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b89a8584-1882-4575-9f93-953827ce54d5
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b89a8584-1882-4575-9f93-953827ce54d5
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
correlation: qa-fa8cf5b4-3669-43ee-bae6-e8263f205591

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa8cf5b4-3669-43ee-bae6-e8263f205591
Content-Type: application/json

--- request body ---
{"handle":"qa-fb144826c3ce","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa8cf5b4-3669-43ee-bae6-e8263f205591
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fa8cf5b4-3669-43ee-bae6-e8263f205591"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d05aed9d-5661-4ab4-b7ee-31b8ba4455a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d05aed9d-5661-4ab4-b7ee-31b8ba4455a3
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d05aed9d-5661-4ab4-b7ee-31b8ba4455a3
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
correlation: qa-84c6cf96-2490-4334-83ed-79e87d972f0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84c6cf96-2490-4334-83ed-79e87d972f0e
Content-Type: application/json

--- request body ---
{"handle":"qa-79d8eb3316be","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84c6cf96-2490-4334-83ed-79e87d972f0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-84c6cf96-2490-4334-83ed-79e87d972f0e"}
```
