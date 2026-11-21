# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-a527ccbf-d4cb-4747-a050-ef5aefe4a027` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-6415a0a6-99b5-4b22-bda0-d42445cf3050` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-fa01a69f-7ac8-48a2-aa58-14e2099f8990` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-c5e40e20-6f37-4cd4-9f00-469b15736935` |
| 5 | `POST /v1/auth/token` | 422 | 48 | `qa-deb1bc15-f762-4aa8-8e6b-95a1c3c7cb97` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-71626aa0-f5bb-4715-9ef0-b47fae88fac7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-35059d4e-c0cd-4001-849e-19d96f59708e` |
| 8 | `POST /v1/auth/token` | 401 | 47 | `qa-4087d786-dc3d-4f4f-96a8-34bc2bae51c6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-03443e44-6275-42c3-90d0-264d239cd8a6` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-6bfa713e-9b2e-4611-b5d4-ffa38305e791` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a527ccbf-d4cb-4747-a050-ef5aefe4a027

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a527ccbf-d4cb-4747-a050-ef5aefe4a027
Content-Type: application/json

--- request body ---
{"handle":"qa-5ed7a2c95a34","displayName":"QA 5ed7a2c95a34","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a527ccbf-d4cb-4747-a050-ef5aefe4a027
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Location: /v1/accounts/qa-5ed7a2c95a34
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d2d03e7-a599-4b9d-baa0-6d2ccb4d31ed","handle":"qa-5ed7a2c95a34","displayName":"QA 5ed7a2c95a34","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.904751681Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6415a0a6-99b5-4b22-bda0-d42445cf3050

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6415a0a6-99b5-4b22-bda0-d42445cf3050
Content-Type: application/json

--- request body ---
{"handle":"qa-455488d17790","displayName":"QA 455488d17790","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-6415a0a6-99b5-4b22-bda0-d42445cf3050
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Location: /v1/accounts/qa-455488d17790
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c626f3f3-d07b-4b62-af0e-824dd87e5079","handle":"qa-455488d17790","displayName":"QA 455488d17790","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.955365265Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fa01a69f-7ac8-48a2-aa58-14e2099f8990

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa01a69f-7ac8-48a2-aa58-14e2099f8990
Content-Type: application/json

--- request body ---
{"handle":"qa-5ed7a2c95a34","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa01a69f-7ac8-48a2-aa58-14e2099f8990
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d2d03e7-a599-4b9d-baa0-6d2ccb4d31ed"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c5e40e20-6f37-4cd4-9f00-469b15736935

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5e40e20-6f37-4cd4-9f00-469b15736935
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-455488d17790","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5e40e20-6f37-4cd4-9f00-469b15736935
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
Location: /v1/conversations/cnv_ab847b5e-4e90-4ffe-8de7-2059cbc9e9f1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ab847b5e-4e90-4ffe-8de7-2059cbc9e9f1","subject":"Error contract","status":"open","region":"eu","participants":["qa-5ed7a2c95a34","qa-455488d17790"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:52.040895810Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-deb1bc15-f762-4aa8-8e6b-95a1c3c7cb97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-deb1bc15-f762-4aa8-8e6b-95a1c3c7cb97
Content-Type: application/json

--- request body ---
{"handle":"qa-5ed7a2c95a34","password":"****","ttlSeconds":0}

--- response: 422 in 48 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-deb1bc15-f762-4aa8-8e6b-95a1c3c7cb97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-deb1bc15-f762-4aa8-8e6b-95a1c3c7cb97","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-71626aa0-f5bb-4715-9ef0-b47fae88fac7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71626aa0-f5bb-4715-9ef0-b47fae88fac7
Content-Type: application/json

--- request body ---
{"handle":"qa-455488d17790","password":"****"}

--- response: 200 in 51 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-71626aa0-f5bb-4715-9ef0-b47fae88fac7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c626f3f3-d07b-4b62-af0e-824dd87e5079"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35059d4e-c0cd-4001-849e-19d96f59708e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35059d4e-c0cd-4001-849e-19d96f59708e
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35059d4e-c0cd-4001-849e-19d96f59708e
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
correlation: qa-4087d786-dc3d-4f4f-96a8-34bc2bae51c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4087d786-dc3d-4f4f-96a8-34bc2bae51c6
Content-Type: application/json

--- request body ---
{"handle":"qa-455488d17790","password":"****"}

--- response: 401 in 47 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4087d786-dc3d-4f4f-96a8-34bc2bae51c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4087d786-dc3d-4f4f-96a8-34bc2bae51c6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-03443e44-6275-42c3-90d0-264d239cd8a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03443e44-6275-42c3-90d0-264d239cd8a6
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-03443e44-6275-42c3-90d0-264d239cd8a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-6bfa713e-9b2e-4611-b5d4-ffa38305e791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bfa713e-9b2e-4611-b5d4-ffa38305e791
Content-Type: application/json

--- request body ---
{"handle":"qa-5ed7a2c95a34","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6bfa713e-9b2e-4611-b5d4-ffa38305e791
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6bfa713e-9b2e-4611-b5d4-ffa38305e791"}
```
