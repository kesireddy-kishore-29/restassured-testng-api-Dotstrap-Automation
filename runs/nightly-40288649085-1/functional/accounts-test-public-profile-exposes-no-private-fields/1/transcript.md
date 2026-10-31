# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-bbf71420-f154-4c68-81e5-44e48032a3c1` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-6a650820-a44b-4ff7-a028-dd7efd477602` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-b469cc12-088b-4cf7-bc68-507086f02f60` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 11 | `qa-27b4e59d-386e-487a-8c41-71f7dcf0ac30` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 10 | `qa-6b5abe9f-8e09-4e20-9908-a66c5afedd21` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 10 | `qa-102dcc10-507c-4345-ab31-e33694aed99f` |
| 7 | `POST /v1/auth/token` | 200 | 36 | `qa-c08a4722-dbac-4132-a3d4-4416167511c4` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-5753f4e5-51be-48ab-b550-f3751c9f3765` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-940fcdef-9895-4872-8166-32596a1a816b` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-be15e0e4-a164-427b-b24f-5e799f675b37` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-675c1283-4ee7-4ae0-b0b8-a8f61d42bc26` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bbf71420-f154-4c68-81e5-44e48032a3c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbf71420-f154-4c68-81e5-44e48032a3c1
Content-Type: application/json

--- request body ---
{"handle":"qa-2fb15d47dc66","displayName":"QA 2fb15d47dc66","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbf71420-f154-4c68-81e5-44e48032a3c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-2fb15d47dc66
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5584ffe8-bd46-4be5-b546-0f7d0df0f44e","handle":"qa-2fb15d47dc66","displayName":"QA 2fb15d47dc66","region":"eu","role":"user","createdAt":"2026-10-26T07:54:42.865595063Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6a650820-a44b-4ff7-a028-dd7efd477602

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a650820-a44b-4ff7-a028-dd7efd477602
Content-Type: application/json

--- request body ---
{"handle":"qa-328c9f9fa1af","displayName":"QA 328c9f9fa1af","password":"****","region":"us"}

--- response: 201 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a650820-a44b-4ff7-a028-dd7efd477602
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-328c9f9fa1af
X-Served-Region: us
Content-Length: 181

{"id":"acc_9af349ff-1ad0-4989-8de3-53858ab696e1","handle":"qa-328c9f9fa1af","displayName":"QA 328c9f9fa1af","region":"us","role":"user","createdAt":"2026-10-26T07:54:42.893751201Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b469cc12-088b-4cf7-bc68-507086f02f60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b469cc12-088b-4cf7-bc68-507086f02f60
Content-Type: application/json

--- request body ---
{"handle":"qa-2fb15d47dc66","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-b469cc12-088b-4cf7-bc68-507086f02f60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5584ffe8-bd46-4be5-b546-0f7d0df0f44e"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-328c9f9fa1af
correlation: qa-27b4e59d-386e-487a-8c41-71f7dcf0ac30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27b4e59d-386e-487a-8c41-71f7dcf0ac30
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-27b4e59d-386e-487a-8c41-71f7dcf0ac30
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
Content-Length: 74

{"handle":"qa-328c9f9fa1af","displayName":"QA 328c9f9fa1af","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-328c9f9fa1af
correlation: qa-6b5abe9f-8e09-4e20-9908-a66c5afedd21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b5abe9f-8e09-4e20-9908-a66c5afedd21
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b5abe9f-8e09-4e20-9908-a66c5afedd21
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
Content-Length: 74

{"handle":"qa-328c9f9fa1af","displayName":"QA 328c9f9fa1af","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-328c9f9fa1af
correlation: qa-102dcc10-507c-4345-ab31-e33694aed99f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-102dcc10-507c-4345-ab31-e33694aed99f
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-102dcc10-507c-4345-ab31-e33694aed99f
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
Content-Length: 74

{"handle":"qa-328c9f9fa1af","displayName":"QA 328c9f9fa1af","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-c08a4722-dbac-4132-a3d4-4416167511c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c08a4722-dbac-4132-a3d4-4416167511c4
Content-Type: application/json

--- request body ---
{"handle":"qa-328c9f9fa1af","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-c08a4722-dbac-4132-a3d4-4416167511c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9af349ff-1ad0-4989-8de3-53858ab696e1"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5753f4e5-51be-48ab-b550-f3751c9f3765

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5753f4e5-51be-48ab-b550-f3751c9f3765
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5753f4e5-51be-48ab-b550-f3751c9f3765
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
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-940fcdef-9895-4872-8166-32596a1a816b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-940fcdef-9895-4872-8166-32596a1a816b
Content-Type: application/json

--- request body ---
{"handle":"qa-328c9f9fa1af","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-940fcdef-9895-4872-8166-32596a1a816b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-940fcdef-9895-4872-8166-32596a1a816b"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-be15e0e4-a164-427b-b24f-5e799f675b37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be15e0e4-a164-427b-b24f-5e799f675b37
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-be15e0e4-a164-427b-b24f-5e799f675b37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-675c1283-4ee7-4ae0-b0b8-a8f61d42bc26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-675c1283-4ee7-4ae0-b0b8-a8f61d42bc26
Content-Type: application/json

--- request body ---
{"handle":"qa-2fb15d47dc66","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-675c1283-4ee7-4ae0-b0b8-a8f61d42bc26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-675c1283-4ee7-4ae0-b0b8-a8f61d42bc26"}
```
