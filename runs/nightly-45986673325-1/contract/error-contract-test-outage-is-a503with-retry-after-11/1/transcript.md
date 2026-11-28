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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-5c0702ec-472a-43f6-a5fb-dec08044d069` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-ec48ed64-98a1-421d-9f41-90388749a1fe` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-502de276-9f59-42b7-86eb-4f4c87ecf796` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-506b6f09-5976-4c31-aa0f-34e9999bc61b` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 20 | `qa-994d1763-4c04-4b70-b455-a8b5d04cf9f8` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-4562c88f-4116-4925-803c-775da76627f8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-851698da-b043-4b74-8ad6-cb7d73851ec2` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-719cd50a-82da-4eea-9f28-9c66c6170679` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-b4a573a2-3de3-4d92-9acf-363137864859` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-0a90f621-f847-4941-8f7c-295a4642876a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5c0702ec-472a-43f6-a5fb-dec08044d069

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c0702ec-472a-43f6-a5fb-dec08044d069
Content-Type: application/json

--- request body ---
{"handle":"qa-28328054f667","displayName":"QA 28328054f667","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c0702ec-472a-43f6-a5fb-dec08044d069
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 7
Location: /v1/accounts/qa-28328054f667
X-Served-Region: eu
Content-Length: 181

{"id":"acc_157d95ba-700c-474b-b0c2-07a3727229de","handle":"qa-28328054f667","displayName":"QA 28328054f667","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.232977066Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ec48ed64-98a1-421d-9f41-90388749a1fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec48ed64-98a1-421d-9f41-90388749a1fe
Content-Type: application/json

--- request body ---
{"handle":"qa-f048ee906801","displayName":"QA f048ee906801","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec48ed64-98a1-421d-9f41-90388749a1fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 7
Location: /v1/accounts/qa-f048ee906801
X-Served-Region: eu
Content-Length: 181

{"id":"acc_221415a8-808f-4ac6-924e-df4a713944c9","handle":"qa-f048ee906801","displayName":"QA f048ee906801","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.257673242Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-502de276-9f59-42b7-86eb-4f4c87ecf796

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-502de276-9f59-42b7-86eb-4f4c87ecf796
Content-Type: application/json

--- request body ---
{"handle":"qa-28328054f667","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-502de276-9f59-42b7-86eb-4f4c87ecf796
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_157d95ba-700c-474b-b0c2-07a3727229de"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-506b6f09-5976-4c31-aa0f-34e9999bc61b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-506b6f09-5976-4c31-aa0f-34e9999bc61b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f048ee906801","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-506b6f09-5976-4c31-aa0f-34e9999bc61b
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
Location: /v1/conversations/cnv_9f063dda-0fe5-4ba3-b154-16d544ab3393
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9f063dda-0fe5-4ba3-b154-16d544ab3393","subject":"Error contract","status":"open","region":"eu","participants":["qa-28328054f667","qa-f048ee906801"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.336864504Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_9f063dda-0fe5-4ba3-b154-16d544ab3393/read
correlation: qa-994d1763-4c04-4b70-b455-a8b5d04cf9f8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 81334640-02c3-4355-bb2d-47358ab8ff64
X-Correlation-Id: qa-994d1763-4c04-4b70-b455-a8b5d04cf9f8
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-994d1763-4c04-4b70-b455-a8b5d04cf9f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_9f063dda-0fe5-4ba3-b154-16d544ab3393/read","correlationId":"qa-994d1763-4c04-4b70-b455-a8b5d04cf9f8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4562c88f-4116-4925-803c-775da76627f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4562c88f-4116-4925-803c-775da76627f8
Content-Type: application/json

--- request body ---
{"handle":"qa-f048ee906801","password":"****"}

--- response: 200 in 47 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4562c88f-4116-4925-803c-775da76627f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_221415a8-808f-4ac6-924e-df4a713944c9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-851698da-b043-4b74-8ad6-cb7d73851ec2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-851698da-b043-4b74-8ad6-cb7d73851ec2
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-851698da-b043-4b74-8ad6-cb7d73851ec2
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
correlation: qa-719cd50a-82da-4eea-9f28-9c66c6170679

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-719cd50a-82da-4eea-9f28-9c66c6170679
Content-Type: application/json

--- request body ---
{"handle":"qa-f048ee906801","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-719cd50a-82da-4eea-9f28-9c66c6170679
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-719cd50a-82da-4eea-9f28-9c66c6170679"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b4a573a2-3de3-4d92-9acf-363137864859

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4a573a2-3de3-4d92-9acf-363137864859
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b4a573a2-3de3-4d92-9acf-363137864859
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
correlation: qa-0a90f621-f847-4941-8f7c-295a4642876a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a90f621-f847-4941-8f7c-295a4642876a
Content-Type: application/json

--- request body ---
{"handle":"qa-28328054f667","password":"****"}

--- response: 401 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a90f621-f847-4941-8f7c-295a4642876a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0a90f621-f847-4941-8f7c-295a4642876a"}
```
