# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-91c52512-5316-4461-956e-0886f1f03d7e` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-b41770e5-c18f-4c23-87bb-a36391962f6b` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-a3a77f11-25d6-41fb-ac09-8e9bb540b496` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-d111145c-07f9-4b69-b0c2-7e0127074849` |
| 5 | `POST /v1/credits/purchases` | 400 | 11 | `qa-4edaa037-cc0d-4b4a-a6c8-f721db21250f` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-7146cb52-dd94-4bfb-bdeb-96170b356f6f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-6fc13f41-a307-4313-8d60-59f5301ede06` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-3f3ceaf6-b656-43df-8002-44d2e4b996cf` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-6ea32aef-3e68-432f-854a-cddfc6f7bd26` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-7b334336-1b7e-4947-8ba7-52244a4f0c8b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-91c52512-5316-4461-956e-0886f1f03d7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91c52512-5316-4461-956e-0886f1f03d7e
Content-Type: application/json

--- request body ---
{"handle":"qa-83479a20c035","displayName":"QA 83479a20c035","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-91c52512-5316-4461-956e-0886f1f03d7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 8
Location: /v1/accounts/qa-83479a20c035
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28c22499-2324-4592-b93a-a5b3e18f3f04","handle":"qa-83479a20c035","displayName":"QA 83479a20c035","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.691184972Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b41770e5-c18f-4c23-87bb-a36391962f6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b41770e5-c18f-4c23-87bb-a36391962f6b
Content-Type: application/json

--- request body ---
{"handle":"qa-afeef8ec6b2f","displayName":"QA afeef8ec6b2f","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b41770e5-c18f-4c23-87bb-a36391962f6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 8
Location: /v1/accounts/qa-afeef8ec6b2f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dd1e9117-4dfb-43d0-a89a-42e184f6cffd","handle":"qa-afeef8ec6b2f","displayName":"QA afeef8ec6b2f","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.712589736Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a3a77f11-25d6-41fb-ac09-8e9bb540b496

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3a77f11-25d6-41fb-ac09-8e9bb540b496
Content-Type: application/json

--- request body ---
{"handle":"qa-83479a20c035","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3a77f11-25d6-41fb-ac09-8e9bb540b496
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28c22499-2324-4592-b93a-a5b3e18f3f04"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d111145c-07f9-4b69-b0c2-7e0127074849

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d111145c-07f9-4b69-b0c2-7e0127074849
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-afeef8ec6b2f","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d111145c-07f9-4b69-b0c2-7e0127074849
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
Location: /v1/conversations/cnv_e1ca12f8-de10-4c23-bbee-66527e4f289c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e1ca12f8-de10-4c23-bbee-66527e4f289c","subject":"Error contract","status":"open","region":"eu","participants":["qa-83479a20c035","qa-afeef8ec6b2f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.769994510Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4edaa037-cc0d-4b4a-a6c8-f721db21250f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8e1876adc22740daa460f2884cd11936
X-Correlation-Id: qa-4edaa037-cc0d-4b4a-a6c8-f721db21250f
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4edaa037-cc0d-4b4a-a6c8-f721db21250f
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-4edaa037-cc0d-4b4a-a6c8-f721db21250f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7146cb52-dd94-4bfb-bdeb-96170b356f6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7146cb52-dd94-4bfb-bdeb-96170b356f6f
Content-Type: application/json

--- request body ---
{"handle":"qa-afeef8ec6b2f","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7146cb52-dd94-4bfb-bdeb-96170b356f6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dd1e9117-4dfb-43d0-a89a-42e184f6cffd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6fc13f41-a307-4313-8d60-59f5301ede06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fc13f41-a307-4313-8d60-59f5301ede06
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6fc13f41-a307-4313-8d60-59f5301ede06
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
correlation: qa-3f3ceaf6-b656-43df-8002-44d2e4b996cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f3ceaf6-b656-43df-8002-44d2e4b996cf
Content-Type: application/json

--- request body ---
{"handle":"qa-afeef8ec6b2f","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f3ceaf6-b656-43df-8002-44d2e4b996cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3f3ceaf6-b656-43df-8002-44d2e4b996cf"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6ea32aef-3e68-432f-854a-cddfc6f7bd26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ea32aef-3e68-432f-854a-cddfc6f7bd26
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6ea32aef-3e68-432f-854a-cddfc6f7bd26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7b334336-1b7e-4947-8ba7-52244a4f0c8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b334336-1b7e-4947-8ba7-52244a4f0c8b
Content-Type: application/json

--- request body ---
{"handle":"qa-83479a20c035","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b334336-1b7e-4947-8ba7-52244a4f0c8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7b334336-1b7e-4947-8ba7-52244a4f0c8b"}
```
