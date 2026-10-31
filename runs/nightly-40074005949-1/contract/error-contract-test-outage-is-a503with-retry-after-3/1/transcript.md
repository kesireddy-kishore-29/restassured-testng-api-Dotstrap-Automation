# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 65 | `qa-093c9f30-8236-413d-a855-a3488345f7cf` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-3207ead6-cffb-47f7-b3b4-7fa223ff690b` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-4310c3d8-4cc6-425c-9b8c-07f05e738247` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-07c0ea9c-4f28-4ba8-ba21-f05e318cdeac` |
| 5 | `PATCH /v1/accounts/me` | 503 | 10 | `qa-737ec142-0f04-413a-a4d1-56e820c39fd7` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-3690131e-8c75-40ca-902c-686e9cdba084` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-462854e3-196e-47ce-b4f8-dffe815f4fd8` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-0b2c9807-e796-4b5c-ba09-afb9d5822278` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-a9417c34-cd32-4c9f-b21a-5b8ff0ef407a` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-7367eafb-cee4-498d-895f-4faf0a8f070a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-093c9f30-8236-413d-a855-a3488345f7cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-093c9f30-8236-413d-a855-a3488345f7cf
Content-Type: application/json

--- request body ---
{"handle":"qa-c1fb5d54aa5b","displayName":"QA c1fb5d54aa5b","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-093c9f30-8236-413d-a855-a3488345f7cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-c1fb5d54aa5b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e9583b1-fa0f-405d-aa73-cadaccc89a6e","handle":"qa-c1fb5d54aa5b","displayName":"QA c1fb5d54aa5b","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.803735498Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3207ead6-cffb-47f7-b3b4-7fa223ff690b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3207ead6-cffb-47f7-b3b4-7fa223ff690b
Content-Type: application/json

--- request body ---
{"handle":"qa-0ed0cbcabecf","displayName":"QA 0ed0cbcabecf","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-3207ead6-cffb-47f7-b3b4-7fa223ff690b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 10
Location: /v1/accounts/qa-0ed0cbcabecf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50dc3cf4-096a-45ad-82c7-37fe086371fb","handle":"qa-0ed0cbcabecf","displayName":"QA 0ed0cbcabecf","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.882389390Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4310c3d8-4cc6-425c-9b8c-07f05e738247

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4310c3d8-4cc6-425c-9b8c-07f05e738247
Content-Type: application/json

--- request body ---
{"handle":"qa-c1fb5d54aa5b","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-4310c3d8-4cc6-425c-9b8c-07f05e738247
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e9583b1-fa0f-405d-aa73-cadaccc89a6e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-07c0ea9c-4f28-4ba8-ba21-f05e318cdeac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07c0ea9c-4f28-4ba8-ba21-f05e318cdeac
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0ed0cbcabecf","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-07c0ea9c-4f28-4ba8-ba21-f05e318cdeac
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
Location: /v1/conversations/cnv_f1658352-b283-4f2e-8961-011bb948a48e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f1658352-b283-4f2e-8961-011bb948a48e","subject":"Error contract","status":"open","region":"eu","participants":["qa-c1fb5d54aa5b","qa-0ed0cbcabecf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:01.950567085Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-737ec142-0f04-413a-a4d1-56e820c39fd7

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 742711eb-37b0-461e-b6d7-80d1e277c80c
X-Correlation-Id: qa-737ec142-0f04-413a-a4d1-56e820c39fd7
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-737ec142-0f04-413a-a4d1-56e820c39fd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-737ec142-0f04-413a-a4d1-56e820c39fd7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3690131e-8c75-40ca-902c-686e9cdba084

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3690131e-8c75-40ca-902c-686e9cdba084
Content-Type: application/json

--- request body ---
{"handle":"qa-0ed0cbcabecf","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3690131e-8c75-40ca-902c-686e9cdba084
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50dc3cf4-096a-45ad-82c7-37fe086371fb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-462854e3-196e-47ce-b4f8-dffe815f4fd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-462854e3-196e-47ce-b4f8-dffe815f4fd8
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-462854e3-196e-47ce-b4f8-dffe815f4fd8
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
correlation: qa-0b2c9807-e796-4b5c-ba09-afb9d5822278

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b2c9807-e796-4b5c-ba09-afb9d5822278
Content-Type: application/json

--- request body ---
{"handle":"qa-0ed0cbcabecf","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b2c9807-e796-4b5c-ba09-afb9d5822278
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0b2c9807-e796-4b5c-ba09-afb9d5822278"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a9417c34-cd32-4c9f-b21a-5b8ff0ef407a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9417c34-cd32-4c9f-b21a-5b8ff0ef407a
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a9417c34-cd32-4c9f-b21a-5b8ff0ef407a
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
correlation: qa-7367eafb-cee4-498d-895f-4faf0a8f070a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7367eafb-cee4-498d-895f-4faf0a8f070a
Content-Type: application/json

--- request body ---
{"handle":"qa-c1fb5d54aa5b","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7367eafb-cee4-498d-895f-4faf0a8f070a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7367eafb-cee4-498d-895f-4faf0a8f070a"}
```
