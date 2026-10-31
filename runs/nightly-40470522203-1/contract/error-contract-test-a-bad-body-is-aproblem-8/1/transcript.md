# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-f215d8d5-3145-4a01-a806-880602f548b3` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-43118cf8-3806-448c-9bdc-7aa15bda1a88` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-d41e6d2b-2a78-4b7e-a618-0d112774d441` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-1e8c53f5-c300-4fb0-9341-ca1c25d9d866` |
| 5 | `PATCH /v1/accounts/me` | 422 | 10 | `qa-7f83de12-97fb-417f-b481-6847aadde8e1` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-718fedf6-720e-4b30-85cd-ee74116fd554` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-5ec16788-3750-4c98-a55b-63c84fd95dc8` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-038125ec-0e22-4c91-8752-d5d6015585a6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-1812cdbd-44b7-451d-a45a-1bb6239fb5f7` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-309ac7e8-3add-4d0f-90b5-90cf96013dc5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f215d8d5-3145-4a01-a806-880602f548b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f215d8d5-3145-4a01-a806-880602f548b3
Content-Type: application/json

--- request body ---
{"handle":"qa-f432edb33207","displayName":"QA f432edb33207","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f215d8d5-3145-4a01-a806-880602f548b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 7
Location: /v1/accounts/qa-f432edb33207
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b78f885c-5bf2-4c35-aa9e-beca56e6bc62","handle":"qa-f432edb33207","displayName":"QA f432edb33207","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.806003377Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-43118cf8-3806-448c-9bdc-7aa15bda1a88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43118cf8-3806-448c-9bdc-7aa15bda1a88
Content-Type: application/json

--- request body ---
{"handle":"qa-66326a953bae","displayName":"QA 66326a953bae","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-43118cf8-3806-448c-9bdc-7aa15bda1a88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 7
Location: /v1/accounts/qa-66326a953bae
X-Served-Region: eu
Content-Length: 181

{"id":"acc_914069a7-6517-435a-9700-0b4477f41588","handle":"qa-66326a953bae","displayName":"QA 66326a953bae","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.865598697Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d41e6d2b-2a78-4b7e-a618-0d112774d441

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d41e6d2b-2a78-4b7e-a618-0d112774d441
Content-Type: application/json

--- request body ---
{"handle":"qa-f432edb33207","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-d41e6d2b-2a78-4b7e-a618-0d112774d441
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b78f885c-5bf2-4c35-aa9e-beca56e6bc62"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1e8c53f5-c300-4fb0-9341-ca1c25d9d866

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e8c53f5-c300-4fb0-9341-ca1c25d9d866
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-66326a953bae","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e8c53f5-c300-4fb0-9341-ca1c25d9d866
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
Location: /v1/conversations/cnv_0d676563-57d3-44f3-b30b-9ad8a1808962
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0d676563-57d3-44f3-b30b-9ad8a1808962","subject":"Error contract","status":"open","region":"eu","participants":["qa-f432edb33207","qa-66326a953bae"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.943771928Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-7f83de12-97fb-417f-b481-6847aadde8e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f83de12-97fb-417f-b481-6847aadde8e1
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f83de12-97fb-417f-b481-6847aadde8e1
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-7f83de12-97fb-417f-b481-6847aadde8e1","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-718fedf6-720e-4b30-85cd-ee74116fd554

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-718fedf6-720e-4b30-85cd-ee74116fd554
Content-Type: application/json

--- request body ---
{"handle":"qa-66326a953bae","password":"****"}

--- response: 200 in 35 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-718fedf6-720e-4b30-85cd-ee74116fd554
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_914069a7-6517-435a-9700-0b4477f41588"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5ec16788-3750-4c98-a55b-63c84fd95dc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ec16788-3750-4c98-a55b-63c84fd95dc8
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5ec16788-3750-4c98-a55b-63c84fd95dc8
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
correlation: qa-038125ec-0e22-4c91-8752-d5d6015585a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-038125ec-0e22-4c91-8752-d5d6015585a6
Content-Type: application/json

--- request body ---
{"handle":"qa-66326a953bae","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-038125ec-0e22-4c91-8752-d5d6015585a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-038125ec-0e22-4c91-8752-d5d6015585a6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1812cdbd-44b7-451d-a45a-1bb6239fb5f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1812cdbd-44b7-451d-a45a-1bb6239fb5f7
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1812cdbd-44b7-451d-a45a-1bb6239fb5f7
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
correlation: qa-309ac7e8-3add-4d0f-90b5-90cf96013dc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-309ac7e8-3add-4d0f-90b5-90cf96013dc5
Content-Type: application/json

--- request body ---
{"handle":"qa-f432edb33207","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-309ac7e8-3add-4d0f-90b5-90cf96013dc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-309ac7e8-3add-4d0f-90b5-90cf96013dc5"}
```
