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
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-2dec053d-4993-469e-a62e-7bb50ec7d610` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-cf3b980b-d75e-4aff-b0b8-028e9a950517` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-ab214262-1e7c-409e-b0d8-363c28aa775e` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 15 | `qa-f2ac0ff8-6f2d-4b24-975c-cd78fc77e8de` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 26 | `qa-0ab68fb4-0da3-4977-b3b7-6b973e7701e9` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 13 | `qa-45cfb478-8c66-4679-9966-f1b6a487a303` |
| 7 | `POST /v1/auth/token` | 200 | 19 | `qa-e05abe13-7de2-4ead-b91b-12a4f1b748c3` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-7570827b-f993-4799-9c48-f8a0af830f7d` |
| 9 | `POST /v1/auth/token` | 401 | 17 | `qa-ac767d33-1d70-4077-a48a-25e85fa61122` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-edb23c63-8e23-4a47-99cc-6e345308a943` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-f8b006fa-f173-412d-8e37-5a49febc6f6b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2dec053d-4993-469e-a62e-7bb50ec7d610

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dec053d-4993-469e-a62e-7bb50ec7d610
Content-Type: application/json

--- request body ---
{"handle":"qa-94c365e24149","displayName":"QA 94c365e24149","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dec053d-4993-469e-a62e-7bb50ec7d610
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-94c365e24149
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88081f6f-ff1f-479a-a536-cf9733128a59","handle":"qa-94c365e24149","displayName":"QA 94c365e24149","region":"eu","role":"user","createdAt":"2026-11-05T09:37:52.515380247Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cf3b980b-d75e-4aff-b0b8-028e9a950517

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf3b980b-d75e-4aff-b0b8-028e9a950517
Content-Type: application/json

--- request body ---
{"handle":"qa-ce5b9ffd815a","displayName":"QA ce5b9ffd815a","password":"****","region":"us"}

--- response: 201 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf3b980b-d75e-4aff-b0b8-028e9a950517
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-ce5b9ffd815a
X-Served-Region: us
Content-Length: 181

{"id":"acc_a036f4cb-3746-4cea-8fa5-341fe428cd88","handle":"qa-ce5b9ffd815a","displayName":"QA ce5b9ffd815a","region":"us","role":"user","createdAt":"2026-11-05T09:37:52.537833645Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ab214262-1e7c-409e-b0d8-363c28aa775e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab214262-1e7c-409e-b0d8-363c28aa775e
Content-Type: application/json

--- request body ---
{"handle":"qa-94c365e24149","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab214262-1e7c-409e-b0d8-363c28aa775e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_88081f6f-ff1f-479a-a536-cf9733128a59"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-ce5b9ffd815a
correlation: qa-f2ac0ff8-6f2d-4b24-975c-cd78fc77e8de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2ac0ff8-6f2d-4b24-975c-cd78fc77e8de
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2ac0ff8-6f2d-4b24-975c-cd78fc77e8de
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

{"handle":"qa-ce5b9ffd815a","displayName":"QA ce5b9ffd815a","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-ce5b9ffd815a
correlation: qa-0ab68fb4-0da3-4977-b3b7-6b973e7701e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ab68fb4-0da3-4977-b3b7-6b973e7701e9
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ab68fb4-0da3-4977-b3b7-6b973e7701e9
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

{"handle":"qa-ce5b9ffd815a","displayName":"QA ce5b9ffd815a","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-ce5b9ffd815a
correlation: qa-45cfb478-8c66-4679-9966-f1b6a487a303

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45cfb478-8c66-4679-9966-f1b6a487a303
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-45cfb478-8c66-4679-9966-f1b6a487a303
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

{"handle":"qa-ce5b9ffd815a","displayName":"QA ce5b9ffd815a","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-e05abe13-7de2-4ead-b91b-12a4f1b748c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e05abe13-7de2-4ead-b91b-12a4f1b748c3
Content-Type: application/json

--- request body ---
{"handle":"qa-ce5b9ffd815a","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e05abe13-7de2-4ead-b91b-12a4f1b748c3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a036f4cb-3746-4cea-8fa5-341fe428cd88"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7570827b-f993-4799-9c48-f8a0af830f7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7570827b-f993-4799-9c48-f8a0af830f7d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7570827b-f993-4799-9c48-f8a0af830f7d
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
correlation: qa-ac767d33-1d70-4077-a48a-25e85fa61122

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac767d33-1d70-4077-a48a-25e85fa61122
Content-Type: application/json

--- request body ---
{"handle":"qa-ce5b9ffd815a","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac767d33-1d70-4077-a48a-25e85fa61122
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ac767d33-1d70-4077-a48a-25e85fa61122"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-edb23c63-8e23-4a47-99cc-6e345308a943

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edb23c63-8e23-4a47-99cc-6e345308a943
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-edb23c63-8e23-4a47-99cc-6e345308a943
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
correlation: qa-f8b006fa-f173-412d-8e37-5a49febc6f6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8b006fa-f173-412d-8e37-5a49febc6f6b
Content-Type: application/json

--- request body ---
{"handle":"qa-94c365e24149","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8b006fa-f173-412d-8e37-5a49febc6f6b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f8b006fa-f173-412d-8e37-5a49febc6f6b"}
```
