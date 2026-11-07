# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 415 | `qa-0b9012c3-83b8-4b89-a992-af93a869d395` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-7ba10808-2575-4de6-b0a5-933866ea6390` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-ab911d3b-b3b7-40fa-ab7d-17e833a59c8a` |
| 4 | `POST /v1/auth/token` | 200 | 28 | `qa-6ede55bc-d52e-4fc2-b0a3-574457e2ed42` |
| 5 | `GET /v1/accounts/me` | 200 | 15 | `qa-70a39957-3d0a-42a0-97b8-67cf5b09be0f` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 40 | `qa-972ecb47-cf85-450f-b034-ce02d0385b02` |
| 7 | `POST /v1/auth/token` | 200 | 17 | `qa-aea4f195-5117-4f04-afa9-04b4d6a8266a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-a09e54c2-1646-4db5-a005-988b913ee0e3` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-35a66c7c-a0fe-4809-93b2-2cabcfa0d91a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-61f0eaef-701f-4d9f-b742-68b437a3ca5e` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-c3e8cc11-53a6-4252-8b89-cb6386c14a1a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0b9012c3-83b8-4b89-a992-af93a869d395

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b9012c3-83b8-4b89-a992-af93a869d395
Content-Type: application/json

--- request body ---
{"handle":"qa-a46e7356ee82","displayName":"QA a46e7356ee82","password":"****","region":"eu"}

--- response: 201 in 415 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b9012c3-83b8-4b89-a992-af93a869d395
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-a46e7356ee82
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b169eba6-7148-45b4-aca8-1b2f057be936","handle":"qa-a46e7356ee82","displayName":"QA a46e7356ee82","region":"eu","role":"user","createdAt":"2026-10-31T08:31:34.467640275Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7ba10808-2575-4de6-b0a5-933866ea6390

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ba10808-2575-4de6-b0a5-933866ea6390
Content-Type: application/json

--- request body ---
{"handle":"qa-815903543c0b","displayName":"QA 815903543c0b","password":"****","region":"us"}

--- response: 201 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ba10808-2575-4de6-b0a5-933866ea6390
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-815903543c0b
X-Served-Region: us
Content-Length: 181

{"id":"acc_0d6ced55-6cb1-4ce3-a716-d056e3d001d0","handle":"qa-815903543c0b","displayName":"QA 815903543c0b","region":"us","role":"user","createdAt":"2026-10-31T08:31:34.876767603Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ab911d3b-b3b7-40fa-ab7d-17e833a59c8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab911d3b-b3b7-40fa-ab7d-17e833a59c8a
Content-Type: application/json

--- request body ---
{"handle":"qa-a46e7356ee82","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab911d3b-b3b7-40fa-ab7d-17e833a59c8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b169eba6-7148-45b4-aca8-1b2f057be936"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-6ede55bc-d52e-4fc2-b0a3-574457e2ed42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ede55bc-d52e-4fc2-b0a3-574457e2ed42
Content-Type: application/json

--- request body ---
{"handle":"qa-a46e7356ee82","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ede55bc-d52e-4fc2-b0a3-574457e2ed42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b169eba6-7148-45b4-aca8-1b2f057be936"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-70a39957-3d0a-42a0-97b8-67cf5b09be0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70a39957-3d0a-42a0-97b8-67cf5b09be0f
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-70a39957-3d0a-42a0-97b8-67cf5b09be0f
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
Content-Length: 181

{"id":"acc_b169eba6-7148-45b4-aca8-1b2f057be936","handle":"qa-a46e7356ee82","displayName":"QA a46e7356ee82","region":"eu","role":"user","createdAt":"2026-10-31T08:31:34.467640275Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-815903543c0b
correlation: qa-972ecb47-cf85-450f-b034-ce02d0385b02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-972ecb47-cf85-450f-b034-ce02d0385b02
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-972ecb47-cf85-450f-b034-ce02d0385b02
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

{"handle":"qa-815903543c0b","displayName":"QA 815903543c0b","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-aea4f195-5117-4f04-afa9-04b4d6a8266a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aea4f195-5117-4f04-afa9-04b4d6a8266a
Content-Type: application/json

--- request body ---
{"handle":"qa-815903543c0b","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-aea4f195-5117-4f04-afa9-04b4d6a8266a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0d6ced55-6cb1-4ce3-a716-d056e3d001d0"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a09e54c2-1646-4db5-a005-988b913ee0e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a09e54c2-1646-4db5-a005-988b913ee0e3
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a09e54c2-1646-4db5-a005-988b913ee0e3
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
correlation: qa-35a66c7c-a0fe-4809-93b2-2cabcfa0d91a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35a66c7c-a0fe-4809-93b2-2cabcfa0d91a
Content-Type: application/json

--- request body ---
{"handle":"qa-815903543c0b","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35a66c7c-a0fe-4809-93b2-2cabcfa0d91a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35a66c7c-a0fe-4809-93b2-2cabcfa0d91a"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-61f0eaef-701f-4d9f-b742-68b437a3ca5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61f0eaef-701f-4d9f-b742-68b437a3ca5e
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-61f0eaef-701f-4d9f-b742-68b437a3ca5e
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-c3e8cc11-53a6-4252-8b89-cb6386c14a1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3e8cc11-53a6-4252-8b89-cb6386c14a1a
Content-Type: application/json

--- request body ---
{"handle":"qa-a46e7356ee82","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3e8cc11-53a6-4252-8b89-cb6386c14a1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c3e8cc11-53a6-4252-8b89-cb6386c14a1a"}
```
