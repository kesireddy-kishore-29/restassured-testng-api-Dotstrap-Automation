# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-a4a52375-6fa3-4a03-a236-888e57338d40` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-0a01f6a5-ef30-422f-99b8-b20697fd8082` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-e8b0984a-3f3c-4995-8921-703fdf72e139` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-4edda76b-8d73-433a-b1cf-eaf949df4adb` |
| 5 | `POST /v1/credits/purchases` | 503 | 12 | `qa-f43fee45-4ccf-4334-a03a-834d1f43110a` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-4ee53ac5-61b9-4d15-b02e-4f3c27fdd767` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-0cbf7624-554f-41b0-b4e7-367c08674b14` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-c6c4e518-4012-4dbc-8a8d-c3f5c8b34088` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-09130023-838a-4fbb-82d1-19a56b849e2c` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-70806049-e1ca-45c8-84da-1f3258adcf09` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a4a52375-6fa3-4a03-a236-888e57338d40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4a52375-6fa3-4a03-a236-888e57338d40
Content-Type: application/json

--- request body ---
{"handle":"qa-30ffcaaa9128","displayName":"QA 30ffcaaa9128","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4a52375-6fa3-4a03-a236-888e57338d40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 7
Location: /v1/accounts/qa-30ffcaaa9128
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9ec53b1c-55f8-4717-a6fa-c86b8b4ee783","handle":"qa-30ffcaaa9128","displayName":"QA 30ffcaaa9128","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.860012666Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0a01f6a5-ef30-422f-99b8-b20697fd8082

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a01f6a5-ef30-422f-99b8-b20697fd8082
Content-Type: application/json

--- request body ---
{"handle":"qa-0312a59565a5","displayName":"QA 0312a59565a5","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a01f6a5-ef30-422f-99b8-b20697fd8082
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 7
Location: /v1/accounts/qa-0312a59565a5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_69796759-ad4c-43bf-882d-5bba6d8b4371","handle":"qa-0312a59565a5","displayName":"QA 0312a59565a5","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.878106462Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e8b0984a-3f3c-4995-8921-703fdf72e139

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8b0984a-3f3c-4995-8921-703fdf72e139
Content-Type: application/json

--- request body ---
{"handle":"qa-30ffcaaa9128","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8b0984a-3f3c-4995-8921-703fdf72e139
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9ec53b1c-55f8-4717-a6fa-c86b8b4ee783"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4edda76b-8d73-433a-b1cf-eaf949df4adb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4edda76b-8d73-433a-b1cf-eaf949df4adb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0312a59565a5","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-4edda76b-8d73-433a-b1cf-eaf949df4adb
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
Location: /v1/conversations/cnv_a456b3d3-0e12-492f-8a46-a336007d6069
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a456b3d3-0e12-492f-8a46-a336007d6069","subject":"Error contract","status":"open","region":"eu","participants":["qa-30ffcaaa9128","qa-0312a59565a5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.931844179Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f43fee45-4ccf-4334-a03a-834d1f43110a

--- request headers ---
Accept: application/json
X-Fault-Key: b4d0fe90-f5ed-4ad1-993d-720c9e164951
X-Fault: unavailable-once
Idempotency-Key: qa-c20efc410059421f999637251ee1f236
X-Correlation-Id: qa-f43fee45-4ccf-4334-a03a-834d1f43110a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f43fee45-4ccf-4334-a03a-834d1f43110a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-f43fee45-4ccf-4334-a03a-834d1f43110a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4ee53ac5-61b9-4d15-b02e-4f3c27fdd767

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ee53ac5-61b9-4d15-b02e-4f3c27fdd767
Content-Type: application/json

--- request body ---
{"handle":"qa-0312a59565a5","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ee53ac5-61b9-4d15-b02e-4f3c27fdd767
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_69796759-ad4c-43bf-882d-5bba6d8b4371"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0cbf7624-554f-41b0-b4e7-367c08674b14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cbf7624-554f-41b0-b4e7-367c08674b14
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0cbf7624-554f-41b0-b4e7-367c08674b14
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
correlation: qa-c6c4e518-4012-4dbc-8a8d-c3f5c8b34088

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6c4e518-4012-4dbc-8a8d-c3f5c8b34088
Content-Type: application/json

--- request body ---
{"handle":"qa-0312a59565a5","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c6c4e518-4012-4dbc-8a8d-c3f5c8b34088
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c6c4e518-4012-4dbc-8a8d-c3f5c8b34088"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-09130023-838a-4fbb-82d1-19a56b849e2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09130023-838a-4fbb-82d1-19a56b849e2c
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-09130023-838a-4fbb-82d1-19a56b849e2c
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
correlation: qa-70806049-e1ca-45c8-84da-1f3258adcf09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70806049-e1ca-45c8-84da-1f3258adcf09
Content-Type: application/json

--- request body ---
{"handle":"qa-30ffcaaa9128","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70806049-e1ca-45c8-84da-1f3258adcf09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-70806049-e1ca-45c8-84da-1f3258adcf09"}
```
