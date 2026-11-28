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
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-fadb58e7-395a-4281-a2d4-260b3bd8a848` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-d2bb75d2-3760-4a49-9582-1e35a28b51bf` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-9dcbf735-4792-4ff4-a206-21f37f79a2b0` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 8 | `qa-60fafb88-75bf-4074-83d1-617a3cbc8215` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 4 | `qa-2f70fc74-309f-4bdb-adc3-d41e48cb7ed3` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 9 | `qa-45b7fd8f-aec9-46ab-9c69-e8d8fdc348f8` |
| 7 | `POST /v1/auth/token` | 200 | 7 | `qa-52b56793-2839-4816-a025-1ddebbe9afea` |
| 8 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-bbe583fd-8346-4ffe-bb07-3c264e142077` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-f3720b51-8018-45d7-8257-bb9a84717725` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-2973351f-589b-4ab7-b0c9-aba59783b1ec` |
| 11 | `POST /v1/auth/token` | 401 | 3 | `qa-76b26e2f-2130-40ac-a9e5-9f301ef33170` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fadb58e7-395a-4281-a2d4-260b3bd8a848

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fadb58e7-395a-4281-a2d4-260b3bd8a848
Content-Type: application/json

--- request body ---
{"handle":"qa-ca51ec2b58db","displayName":"QA ca51ec2b58db","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-fadb58e7-395a-4281-a2d4-260b3bd8a848
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-ca51ec2b58db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b8358c81-7b9c-4b6c-ba94-ecfd1c0a5c94","handle":"qa-ca51ec2b58db","displayName":"QA ca51ec2b58db","region":"eu","role":"user","createdAt":"2026-11-28T10:37:15.111110707Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d2bb75d2-3760-4a49-9582-1e35a28b51bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2bb75d2-3760-4a49-9582-1e35a28b51bf
Content-Type: application/json

--- request body ---
{"handle":"qa-ab0a78ef495b","displayName":"QA ab0a78ef495b","password":"****","region":"us"}

--- response: 201 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2bb75d2-3760-4a49-9582-1e35a28b51bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-ab0a78ef495b
X-Served-Region: us
Content-Length: 181

{"id":"acc_3b51b2ea-1aff-4a79-b1b8-d27c775ebae2","handle":"qa-ab0a78ef495b","displayName":"QA ab0a78ef495b","region":"us","role":"user","createdAt":"2026-11-28T10:37:15.124407885Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9dcbf735-4792-4ff4-a206-21f37f79a2b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dcbf735-4792-4ff4-a206-21f37f79a2b0
Content-Type: application/json

--- request body ---
{"handle":"qa-ca51ec2b58db","password":"****"}

--- response: 200 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dcbf735-4792-4ff4-a206-21f37f79a2b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b8358c81-7b9c-4b6c-ba94-ecfd1c0a5c94"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-ab0a78ef495b
correlation: qa-60fafb88-75bf-4074-83d1-617a3cbc8215

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60fafb88-75bf-4074-83d1-617a3cbc8215
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-60fafb88-75bf-4074-83d1-617a3cbc8215
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

{"handle":"qa-ab0a78ef495b","displayName":"QA ab0a78ef495b","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-ab0a78ef495b
correlation: qa-2f70fc74-309f-4bdb-adc3-d41e48cb7ed3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f70fc74-309f-4bdb-adc3-d41e48cb7ed3
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f70fc74-309f-4bdb-adc3-d41e48cb7ed3
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

{"handle":"qa-ab0a78ef495b","displayName":"QA ab0a78ef495b","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-ab0a78ef495b
correlation: qa-45b7fd8f-aec9-46ab-9c69-e8d8fdc348f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45b7fd8f-aec9-46ab-9c69-e8d8fdc348f8
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-45b7fd8f-aec9-46ab-9c69-e8d8fdc348f8
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

{"handle":"qa-ab0a78ef495b","displayName":"QA ab0a78ef495b","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-52b56793-2839-4816-a025-1ddebbe9afea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52b56793-2839-4816-a025-1ddebbe9afea
Content-Type: application/json

--- request body ---
{"handle":"qa-ab0a78ef495b","password":"****"}

--- response: 200 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-52b56793-2839-4816-a025-1ddebbe9afea
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b51b2ea-1aff-4a79-b1b8-d27c775ebae2"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bbe583fd-8346-4ffe-bb07-3c264e142077

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbe583fd-8346-4ffe-bb07-3c264e142077
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bbe583fd-8346-4ffe-bb07-3c264e142077
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
correlation: qa-f3720b51-8018-45d7-8257-bb9a84717725

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3720b51-8018-45d7-8257-bb9a84717725
Content-Type: application/json

--- request body ---
{"handle":"qa-ab0a78ef495b","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3720b51-8018-45d7-8257-bb9a84717725
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f3720b51-8018-45d7-8257-bb9a84717725"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2973351f-589b-4ab7-b0c9-aba59783b1ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2973351f-589b-4ab7-b0c9-aba59783b1ec
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2973351f-589b-4ab7-b0c9-aba59783b1ec
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
correlation: qa-76b26e2f-2130-40ac-a9e5-9f301ef33170

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76b26e2f-2130-40ac-a9e5-9f301ef33170
Content-Type: application/json

--- request body ---
{"handle":"qa-ca51ec2b58db","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76b26e2f-2130-40ac-a9e5-9f301ef33170
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-76b26e2f-2130-40ac-a9e5-9f301ef33170"}
```
