# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-e8484d0d-9471-4f7e-a49e-c802f6a8ad36` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-9bb964e9-a3bb-41fc-a953-b76cca647dc6` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-a070b41e-3961-4424-b702-2c334132f42e` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-6a29f8a0-f51d-4270-bfd3-c4f1967d89f9` |
| 5 | `GET /v1/conversations` | 503 | 17 | `qa-1c4ecdd7-5ac0-4278-a756-1cf6f92da427` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-2cb3ec87-e168-48f7-9815-354d50f08024` |
| 7 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-eefb5ef9-a72f-47ad-81ac-28d2f092426a` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-46b35762-810f-4f98-bad2-db01b0897d45` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-02444acf-76af-4bca-a0b0-0ce3b9eee51d` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-a0660b66-0727-4a8c-98d3-3ccdde7e497c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e8484d0d-9471-4f7e-a49e-c802f6a8ad36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8484d0d-9471-4f7e-a49e-c802f6a8ad36
Content-Type: application/json

--- request body ---
{"handle":"qa-12e6684463da","displayName":"QA 12e6684463da","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8484d0d-9471-4f7e-a49e-c802f6a8ad36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 9
Location: /v1/accounts/qa-12e6684463da
X-Served-Region: eu
Content-Length: 181

{"id":"acc_61d29f22-c4f6-47b6-99f0-55000d5d3997","handle":"qa-12e6684463da","displayName":"QA 12e6684463da","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.091558034Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9bb964e9-a3bb-41fc-a953-b76cca647dc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bb964e9-a3bb-41fc-a953-b76cca647dc6
Content-Type: application/json

--- request body ---
{"handle":"qa-3f83964f64c7","displayName":"QA 3f83964f64c7","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bb964e9-a3bb-41fc-a953-b76cca647dc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 9
Location: /v1/accounts/qa-3f83964f64c7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f10be7e5-47f5-49b5-9350-88dce393cf49","handle":"qa-3f83964f64c7","displayName":"QA 3f83964f64c7","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.150374068Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a070b41e-3961-4424-b702-2c334132f42e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a070b41e-3961-4424-b702-2c334132f42e
Content-Type: application/json

--- request body ---
{"handle":"qa-12e6684463da","password":"****"}

--- response: 200 in 46 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-a070b41e-3961-4424-b702-2c334132f42e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_61d29f22-c4f6-47b6-99f0-55000d5d3997"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6a29f8a0-f51d-4270-bfd3-c4f1967d89f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a29f8a0-f51d-4270-bfd3-c4f1967d89f9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3f83964f64c7","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a29f8a0-f51d-4270-bfd3-c4f1967d89f9
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
Location: /v1/conversations/cnv_aeb79e53-cd7d-425e-809a-a84317ed7211
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_aeb79e53-cd7d-425e-809a-a84317ed7211","subject":"Error contract","status":"open","region":"eu","participants":["qa-12e6684463da","qa-3f83964f64c7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.230884680Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-1c4ecdd7-5ac0-4278-a756-1cf6f92da427

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 7469defe-0c8b-4eb4-99a5-6112b08fe347
X-Correlation-Id: qa-1c4ecdd7-5ac0-4278-a756-1cf6f92da427
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c4ecdd7-5ac0-4278-a756-1cf6f92da427
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-1c4ecdd7-5ac0-4278-a756-1cf6f92da427"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2cb3ec87-e168-48f7-9815-354d50f08024

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cb3ec87-e168-48f7-9815-354d50f08024
Content-Type: application/json

--- request body ---
{"handle":"qa-3f83964f64c7","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cb3ec87-e168-48f7-9815-354d50f08024
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f10be7e5-47f5-49b5-9350-88dce393cf49"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eefb5ef9-a72f-47ad-81ac-28d2f092426a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eefb5ef9-a72f-47ad-81ac-28d2f092426a
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eefb5ef9-a72f-47ad-81ac-28d2f092426a
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
correlation: qa-46b35762-810f-4f98-bad2-db01b0897d45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46b35762-810f-4f98-bad2-db01b0897d45
Content-Type: application/json

--- request body ---
{"handle":"qa-3f83964f64c7","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46b35762-810f-4f98-bad2-db01b0897d45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-46b35762-810f-4f98-bad2-db01b0897d45"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-02444acf-76af-4bca-a0b0-0ce3b9eee51d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02444acf-76af-4bca-a0b0-0ce3b9eee51d
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-02444acf-76af-4bca-a0b0-0ce3b9eee51d
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
correlation: qa-a0660b66-0727-4a8c-98d3-3ccdde7e497c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0660b66-0727-4a8c-98d3-3ccdde7e497c
Content-Type: application/json

--- request body ---
{"handle":"qa-12e6684463da","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0660b66-0727-4a8c-98d3-3ccdde7e497c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a0660b66-0727-4a8c-98d3-3ccdde7e497c"}
```
