# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 67 | `qa-368ebd86-b439-405c-982c-96892c3c3b59` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-bc6a4acb-3871-419f-ac4e-62c41bc498e7` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-09ef7e44-10bc-4e25-97b1-4071440c4e5d` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-1c8d0655-c3e0-4cb6-ba27-79208ee4a39a` |
| 5 | `PATCH /v1/accounts/me` | 400 | 21 | `qa-4e8b7f85-35ae-43ec-8e95-a77657b94409` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-bdfe5c74-234a-4816-8d60-146f250474a7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-ee9480fd-a89c-4ba1-8114-ffc84c62333b` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-023eddcc-e7f2-438b-a46d-1cd851f1ef89` |
| 9 | `DELETE /v1/accounts/me` | 204 | 56 | `qa-630d482f-7916-4685-ad2c-2b96b05e5faf` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-60a092c5-0387-4881-bfe5-1c5b9ba9fb4e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-368ebd86-b439-405c-982c-96892c3c3b59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-368ebd86-b439-405c-982c-96892c3c3b59
Content-Type: application/json

--- request body ---
{"handle":"qa-99b767090725","displayName":"QA 99b767090725","password":"****","region":"eu"}

--- response: 201 in 67 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-368ebd86-b439-405c-982c-96892c3c3b59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 7
Location: /v1/accounts/qa-99b767090725
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a0d3cddd-7081-4db8-811e-60b9da2f9649","handle":"qa-99b767090725","displayName":"QA 99b767090725","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.936901888Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bc6a4acb-3871-419f-ac4e-62c41bc498e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc6a4acb-3871-419f-ac4e-62c41bc498e7
Content-Type: application/json

--- request body ---
{"handle":"qa-1f6ac5e07cce","displayName":"QA 1f6ac5e07cce","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc6a4acb-3871-419f-ac4e-62c41bc498e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 7
Location: /v1/accounts/qa-1f6ac5e07cce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3f944c4-5886-4a18-afed-c53ae9522e5d","handle":"qa-1f6ac5e07cce","displayName":"QA 1f6ac5e07cce","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.987976006Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-09ef7e44-10bc-4e25-97b1-4071440c4e5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09ef7e44-10bc-4e25-97b1-4071440c4e5d
Content-Type: application/json

--- request body ---
{"handle":"qa-99b767090725","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-09ef7e44-10bc-4e25-97b1-4071440c4e5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a0d3cddd-7081-4db8-811e-60b9da2f9649"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1c8d0655-c3e0-4cb6-ba27-79208ee4a39a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c8d0655-c3e0-4cb6-ba27-79208ee4a39a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1f6ac5e07cce","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c8d0655-c3e0-4cb6-ba27-79208ee4a39a
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
Location: /v1/conversations/cnv_a4f819a4-eb05-4406-bcaa-c92c62cede3a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a4f819a4-eb05-4406-bcaa-c92c62cede3a","subject":"Error contract","status":"open","region":"eu","participants":["qa-99b767090725","qa-1f6ac5e07cce"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.048527385Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-4e8b7f85-35ae-43ec-8e95-a77657b94409

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e8b7f85-35ae-43ec-8e95-a77657b94409
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e8b7f85-35ae-43ec-8e95-a77657b94409
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-4e8b7f85-35ae-43ec-8e95-a77657b94409"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bdfe5c74-234a-4816-8d60-146f250474a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdfe5c74-234a-4816-8d60-146f250474a7
Content-Type: application/json

--- request body ---
{"handle":"qa-1f6ac5e07cce","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdfe5c74-234a-4816-8d60-146f250474a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3f944c4-5886-4a18-afed-c53ae9522e5d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee9480fd-a89c-4ba1-8114-ffc84c62333b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee9480fd-a89c-4ba1-8114-ffc84c62333b
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee9480fd-a89c-4ba1-8114-ffc84c62333b
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
correlation: qa-023eddcc-e7f2-438b-a46d-1cd851f1ef89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-023eddcc-e7f2-438b-a46d-1cd851f1ef89
Content-Type: application/json

--- request body ---
{"handle":"qa-1f6ac5e07cce","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-023eddcc-e7f2-438b-a46d-1cd851f1ef89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-023eddcc-e7f2-438b-a46d-1cd851f1ef89"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-630d482f-7916-4685-ad2c-2b96b05e5faf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-630d482f-7916-4685-ad2c-2b96b05e5faf
Content-Type: application/json

--- response: 204 in 56 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-630d482f-7916-4685-ad2c-2b96b05e5faf
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
correlation: qa-60a092c5-0387-4881-bfe5-1c5b9ba9fb4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60a092c5-0387-4881-bfe5-1c5b9ba9fb4e
Content-Type: application/json

--- request body ---
{"handle":"qa-99b767090725","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60a092c5-0387-4881-bfe5-1c5b9ba9fb4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-60a092c5-0387-4881-bfe5-1c5b9ba9fb4e"}
```
