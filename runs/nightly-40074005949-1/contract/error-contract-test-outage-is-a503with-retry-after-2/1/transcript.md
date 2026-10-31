# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-8fb8d2f9-632f-4e56-addd-81e49c4a2fe5` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-93d08fed-9a7f-425f-8af3-5f9f80759c47` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-90870995-6494-48b1-90ec-2b92c6ba0221` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-1d6100af-f9c8-411a-a138-a67bf7175ada` |
| 5 | `GET /v1/accounts/me` | 503 | 25 | `qa-08a52e93-f7ac-45cc-bf07-79014b936895` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-392b7204-e343-4118-b3e4-67005e284bf1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-d836d5a0-6df1-48be-8930-6fcd2a1c0309` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-7c74ccb6-4434-470e-a92f-4874ce4be173` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-550b0833-6764-41d9-9721-31d5b03cdeca` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-c1eca3ee-877f-4e07-878c-3d5d9cc6650f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8fb8d2f9-632f-4e56-addd-81e49c4a2fe5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fb8d2f9-632f-4e56-addd-81e49c4a2fe5
Content-Type: application/json

--- request body ---
{"handle":"qa-5037a611994f","displayName":"QA 5037a611994f","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fb8d2f9-632f-4e56-addd-81e49c4a2fe5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Location: /v1/accounts/qa-5037a611994f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7270c27e-47d7-48f5-9632-c7a3cfc94530","handle":"qa-5037a611994f","displayName":"QA 5037a611994f","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.815420414Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-93d08fed-9a7f-425f-8af3-5f9f80759c47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93d08fed-9a7f-425f-8af3-5f9f80759c47
Content-Type: application/json

--- request body ---
{"handle":"qa-4895659e4a5e","displayName":"QA 4895659e4a5e","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-93d08fed-9a7f-425f-8af3-5f9f80759c47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Location: /v1/accounts/qa-4895659e4a5e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_25ecba79-26be-433c-bdc1-008167e80397","handle":"qa-4895659e4a5e","displayName":"QA 4895659e4a5e","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.858717243Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-90870995-6494-48b1-90ec-2b92c6ba0221

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90870995-6494-48b1-90ec-2b92c6ba0221
Content-Type: application/json

--- request body ---
{"handle":"qa-5037a611994f","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-90870995-6494-48b1-90ec-2b92c6ba0221
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7270c27e-47d7-48f5-9632-c7a3cfc94530"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1d6100af-f9c8-411a-a138-a67bf7175ada

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d6100af-f9c8-411a-a138-a67bf7175ada
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4895659e4a5e","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d6100af-f9c8-411a-a138-a67bf7175ada
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
Location: /v1/conversations/cnv_be82719f-34da-40db-8ab6-7f3c20f61f8c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_be82719f-34da-40db-8ab6-7f3c20f61f8c","subject":"Error contract","status":"open","region":"eu","participants":["qa-5037a611994f","qa-4895659e4a5e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:01.923766959Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-08a52e93-f7ac-45cc-bf07-79014b936895

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 827722d2-1d93-4070-89f8-f4936e116d41
X-Correlation-Id: qa-08a52e93-f7ac-45cc-bf07-79014b936895
Content-Type: application/json

--- response: 503 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08a52e93-f7ac-45cc-bf07-79014b936895
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-08a52e93-f7ac-45cc-bf07-79014b936895"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-392b7204-e343-4118-b3e4-67005e284bf1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-392b7204-e343-4118-b3e4-67005e284bf1
Content-Type: application/json

--- request body ---
{"handle":"qa-4895659e4a5e","password":"****"}

--- response: 200 in 40 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-392b7204-e343-4118-b3e4-67005e284bf1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_25ecba79-26be-433c-bdc1-008167e80397"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d836d5a0-6df1-48be-8930-6fcd2a1c0309

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d836d5a0-6df1-48be-8930-6fcd2a1c0309
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d836d5a0-6df1-48be-8930-6fcd2a1c0309
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
correlation: qa-7c74ccb6-4434-470e-a92f-4874ce4be173

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c74ccb6-4434-470e-a92f-4874ce4be173
Content-Type: application/json

--- request body ---
{"handle":"qa-4895659e4a5e","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c74ccb6-4434-470e-a92f-4874ce4be173
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c74ccb6-4434-470e-a92f-4874ce4be173"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-550b0833-6764-41d9-9721-31d5b03cdeca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-550b0833-6764-41d9-9721-31d5b03cdeca
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-550b0833-6764-41d9-9721-31d5b03cdeca
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
correlation: qa-c1eca3ee-877f-4e07-878c-3d5d9cc6650f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1eca3ee-877f-4e07-878c-3d5d9cc6650f
Content-Type: application/json

--- request body ---
{"handle":"qa-5037a611994f","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1eca3ee-877f-4e07-878c-3d5d9cc6650f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c1eca3ee-877f-4e07-878c-3d5d9cc6650f"}
```
