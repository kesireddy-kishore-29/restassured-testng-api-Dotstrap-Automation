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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-c9c57d54-00f5-48a5-8052-c3ff7dd66559` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-b2d9e164-63d2-49c0-9022-dbd81a1c273b` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-77b0612b-037d-49f1-8db9-2bfab2460387` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 20 | `qa-5e4cfd0a-251f-4edb-90b5-9112c25ec27d` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 19 | `qa-7e83bb16-ec8e-4e75-a122-b8524e37bc46` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 13 | `qa-8061740b-1ffc-4180-9a22-4ac5c21a7441` |
| 7 | `POST /v1/auth/token` | 200 | 15 | `qa-39c3630b-363f-4c11-84c3-9f6f6d45ea09` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-5c1d9371-96f8-4870-bc34-4a48d0c41953` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-da1f9af7-575b-4b55-9eb4-82c6e7aec6d6` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-2dcdda72-0a23-4e64-ac0f-651f70ecc254` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-7e0eda65-0bd3-4762-8364-0b2446d1bd8e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c9c57d54-00f5-48a5-8052-c3ff7dd66559

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9c57d54-00f5-48a5-8052-c3ff7dd66559
Content-Type: application/json

--- request body ---
{"handle":"qa-096d76dd941f","displayName":"QA 096d76dd941f","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9c57d54-00f5-48a5-8052-c3ff7dd66559
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
Location: /v1/accounts/qa-096d76dd941f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3af5aca1-e013-49bf-9ad5-fef50a0db791","handle":"qa-096d76dd941f","displayName":"QA 096d76dd941f","region":"eu","role":"user","createdAt":"2026-11-11T09:34:32.351557864Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b2d9e164-63d2-49c0-9022-dbd81a1c273b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2d9e164-63d2-49c0-9022-dbd81a1c273b
Content-Type: application/json

--- request body ---
{"handle":"qa-11c18c20f6d4","displayName":"QA 11c18c20f6d4","password":"****","region":"us"}

--- response: 201 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2d9e164-63d2-49c0-9022-dbd81a1c273b
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
Location: /v1/accounts/qa-11c18c20f6d4
X-Served-Region: us
Content-Length: 181

{"id":"acc_7361e923-a2f8-40b6-8426-b6a8c6b0cbe4","handle":"qa-11c18c20f6d4","displayName":"QA 11c18c20f6d4","region":"us","role":"user","createdAt":"2026-11-11T09:34:32.400045001Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-77b0612b-037d-49f1-8db9-2bfab2460387

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77b0612b-037d-49f1-8db9-2bfab2460387
Content-Type: application/json

--- request body ---
{"handle":"qa-096d76dd941f","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-77b0612b-037d-49f1-8db9-2bfab2460387
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3af5aca1-e013-49bf-9ad5-fef50a0db791"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-11c18c20f6d4
correlation: qa-5e4cfd0a-251f-4edb-90b5-9112c25ec27d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e4cfd0a-251f-4edb-90b5-9112c25ec27d
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e4cfd0a-251f-4edb-90b5-9112c25ec27d
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

{"handle":"qa-11c18c20f6d4","displayName":"QA 11c18c20f6d4","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-11c18c20f6d4
correlation: qa-7e83bb16-ec8e-4e75-a122-b8524e37bc46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e83bb16-ec8e-4e75-a122-b8524e37bc46
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e83bb16-ec8e-4e75-a122-b8524e37bc46
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

{"handle":"qa-11c18c20f6d4","displayName":"QA 11c18c20f6d4","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-11c18c20f6d4
correlation: qa-8061740b-1ffc-4180-9a22-4ac5c21a7441

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8061740b-1ffc-4180-9a22-4ac5c21a7441
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-8061740b-1ffc-4180-9a22-4ac5c21a7441
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

{"handle":"qa-11c18c20f6d4","displayName":"QA 11c18c20f6d4","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-39c3630b-363f-4c11-84c3-9f6f6d45ea09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39c3630b-363f-4c11-84c3-9f6f6d45ea09
Content-Type: application/json

--- request body ---
{"handle":"qa-11c18c20f6d4","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-39c3630b-363f-4c11-84c3-9f6f6d45ea09
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7361e923-a2f8-40b6-8426-b6a8c6b0cbe4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5c1d9371-96f8-4870-bc34-4a48d0c41953

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c1d9371-96f8-4870-bc34-4a48d0c41953
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5c1d9371-96f8-4870-bc34-4a48d0c41953
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
correlation: qa-da1f9af7-575b-4b55-9eb4-82c6e7aec6d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da1f9af7-575b-4b55-9eb4-82c6e7aec6d6
Content-Type: application/json

--- request body ---
{"handle":"qa-11c18c20f6d4","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da1f9af7-575b-4b55-9eb4-82c6e7aec6d6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-da1f9af7-575b-4b55-9eb4-82c6e7aec6d6"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2dcdda72-0a23-4e64-ac0f-651f70ecc254

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dcdda72-0a23-4e64-ac0f-651f70ecc254
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2dcdda72-0a23-4e64-ac0f-651f70ecc254
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
correlation: qa-7e0eda65-0bd3-4762-8364-0b2446d1bd8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e0eda65-0bd3-4762-8364-0b2446d1bd8e
Content-Type: application/json

--- request body ---
{"handle":"qa-096d76dd941f","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e0eda65-0bd3-4762-8364-0b2446d1bd8e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7e0eda65-0bd3-4762-8364-0b2446d1bd8e"}
```
