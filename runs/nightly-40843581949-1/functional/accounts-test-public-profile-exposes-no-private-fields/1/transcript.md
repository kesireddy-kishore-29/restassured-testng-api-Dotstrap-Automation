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
| 1 | `POST /v1/accounts` | 201 | 445 | `qa-9020f27f-8a5e-4cc4-ba0b-41560d5b019c` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-76b046e0-edf8-4cb5-889f-1f53d216f8fe` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-075d10b6-f358-4c94-869c-6ca8880e117d` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 40 | `qa-8567a3c0-c8c2-44d9-b56f-00d2572dbf73` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 29 | `qa-3a0fd1a9-5920-4cef-9e8c-af0d1ad83a93` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 18 | `qa-c7e9a140-b2ee-4587-b015-9b0d39dd3f20` |
| 7 | `POST /v1/auth/token` | 200 | 22 | `qa-4889455f-859d-482c-b42f-4184d07b121d` |
| 8 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-5f05560b-ed96-4cb4-bde4-5ff07700155c` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-25f5d8b4-9a57-4ffb-b804-aa2282ba57e4` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-bd875325-5a39-4e58-b55d-da763f3cd49f` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-25228865-5108-4f7e-b502-a333dbb302d5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9020f27f-8a5e-4cc4-ba0b-41560d5b019c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9020f27f-8a5e-4cc4-ba0b-41560d5b019c
Content-Type: application/json

--- request body ---
{"handle":"qa-744678e425b5","displayName":"QA 744678e425b5","password":"****","region":"eu"}

--- response: 201 in 445 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9020f27f-8a5e-4cc4-ba0b-41560d5b019c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-744678e425b5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1fa65c9c-83c2-4452-92cc-43991f7e5692","handle":"qa-744678e425b5","displayName":"QA 744678e425b5","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.346959232Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-76b046e0-edf8-4cb5-889f-1f53d216f8fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76b046e0-edf8-4cb5-889f-1f53d216f8fe
Content-Type: application/json

--- request body ---
{"handle":"qa-cbcc5162e837","displayName":"QA cbcc5162e837","password":"****","region":"us"}

--- response: 201 in 37 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-76b046e0-edf8-4cb5-889f-1f53d216f8fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-cbcc5162e837
X-Served-Region: us
Content-Length: 181

{"id":"acc_cbccd1c2-204e-42d6-acd4-c1540db29b2c","handle":"qa-cbcc5162e837","displayName":"QA cbcc5162e837","region":"us","role":"user","createdAt":"2026-10-29T08:38:57.757611912Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-075d10b6-f358-4c94-869c-6ca8880e117d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-075d10b6-f358-4c94-869c-6ca8880e117d
Content-Type: application/json

--- request body ---
{"handle":"qa-744678e425b5","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-075d10b6-f358-4c94-869c-6ca8880e117d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1fa65c9c-83c2-4452-92cc-43991f7e5692"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-cbcc5162e837
correlation: qa-8567a3c0-c8c2-44d9-b56f-00d2572dbf73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8567a3c0-c8c2-44d9-b56f-00d2572dbf73
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8567a3c0-c8c2-44d9-b56f-00d2572dbf73
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

{"handle":"qa-cbcc5162e837","displayName":"QA cbcc5162e837","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-cbcc5162e837
correlation: qa-3a0fd1a9-5920-4cef-9e8c-af0d1ad83a93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a0fd1a9-5920-4cef-9e8c-af0d1ad83a93
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a0fd1a9-5920-4cef-9e8c-af0d1ad83a93
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

{"handle":"qa-cbcc5162e837","displayName":"QA cbcc5162e837","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-cbcc5162e837
correlation: qa-c7e9a140-b2ee-4587-b015-9b0d39dd3f20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7e9a140-b2ee-4587-b015-9b0d39dd3f20
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7e9a140-b2ee-4587-b015-9b0d39dd3f20
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

{"handle":"qa-cbcc5162e837","displayName":"QA cbcc5162e837","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-4889455f-859d-482c-b42f-4184d07b121d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4889455f-859d-482c-b42f-4184d07b121d
Content-Type: application/json

--- request body ---
{"handle":"qa-cbcc5162e837","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4889455f-859d-482c-b42f-4184d07b121d
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cbccd1c2-204e-42d6-acd4-c1540db29b2c"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f05560b-ed96-4cb4-bde4-5ff07700155c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f05560b-ed96-4cb4-bde4-5ff07700155c
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f05560b-ed96-4cb4-bde4-5ff07700155c
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
correlation: qa-25f5d8b4-9a57-4ffb-b804-aa2282ba57e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25f5d8b4-9a57-4ffb-b804-aa2282ba57e4
Content-Type: application/json

--- request body ---
{"handle":"qa-cbcc5162e837","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25f5d8b4-9a57-4ffb-b804-aa2282ba57e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-25f5d8b4-9a57-4ffb-b804-aa2282ba57e4"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bd875325-5a39-4e58-b55d-da763f3cd49f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd875325-5a39-4e58-b55d-da763f3cd49f
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bd875325-5a39-4e58-b55d-da763f3cd49f
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
correlation: qa-25228865-5108-4f7e-b502-a333dbb302d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25228865-5108-4f7e-b502-a333dbb302d5
Content-Type: application/json

--- request body ---
{"handle":"qa-744678e425b5","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25228865-5108-4f7e-b502-a333dbb302d5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-25228865-5108-4f7e-b502-a333dbb302d5"}
```
