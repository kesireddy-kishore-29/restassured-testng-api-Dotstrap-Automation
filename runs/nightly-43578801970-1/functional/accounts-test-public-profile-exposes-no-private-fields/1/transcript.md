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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-0ad366ea-16f2-4dc0-84e7-9d4e319baa43` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-3a579c46-8c60-40d4-b79c-27301379e134` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-b2aa5186-3292-4618-9ee1-3893db29e1a8` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 19 | `qa-9e6de5ca-d380-4888-8aa1-6048692416bd` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 9 | `qa-5a5d490a-e25d-400d-b8bd-24bca716a8d0` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 10 | `qa-3ca8786b-6d27-44a7-b6f5-2e83d29495bb` |
| 7 | `POST /v1/auth/token` | 200 | 10 | `qa-ae0277e4-c2c9-4590-ba30-8f3b9baa6204` |
| 8 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-46054ce5-4242-408c-9d78-7257c2c17143` |
| 9 | `POST /v1/auth/token` | 401 | 20 | `qa-e719d5fa-ebc7-41fb-b805-b14c3f319edb` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-7b6d40aa-eba3-4acb-8edc-58966b0720b5` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-ed4d7f3d-7e74-4592-b8f4-16447a2cb691` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0ad366ea-16f2-4dc0-84e7-9d4e319baa43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ad366ea-16f2-4dc0-84e7-9d4e319baa43
Content-Type: application/json

--- request body ---
{"handle":"qa-722a259f6b45","displayName":"QA 722a259f6b45","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ad366ea-16f2-4dc0-84e7-9d4e319baa43
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
Location: /v1/accounts/qa-722a259f6b45
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ee7db137-8654-4a0e-98d4-b37244cd5db7","handle":"qa-722a259f6b45","displayName":"QA 722a259f6b45","region":"eu","role":"user","createdAt":"2026-11-14T09:05:14.523098428Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a579c46-8c60-40d4-b79c-27301379e134

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a579c46-8c60-40d4-b79c-27301379e134
Content-Type: application/json

--- request body ---
{"handle":"qa-0b48550610ea","displayName":"QA 0b48550610ea","password":"****","region":"us"}

--- response: 201 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a579c46-8c60-40d4-b79c-27301379e134
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
Location: /v1/accounts/qa-0b48550610ea
X-Served-Region: us
Content-Length: 181

{"id":"acc_4228b58d-eece-4462-97b6-1a328b2fcb73","handle":"qa-0b48550610ea","displayName":"QA 0b48550610ea","region":"us","role":"user","createdAt":"2026-11-14T09:05:14.551988108Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b2aa5186-3292-4618-9ee1-3893db29e1a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2aa5186-3292-4618-9ee1-3893db29e1a8
Content-Type: application/json

--- request body ---
{"handle":"qa-722a259f6b45","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2aa5186-3292-4618-9ee1-3893db29e1a8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ee7db137-8654-4a0e-98d4-b37244cd5db7"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-0b48550610ea
correlation: qa-9e6de5ca-d380-4888-8aa1-6048692416bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e6de5ca-d380-4888-8aa1-6048692416bd
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e6de5ca-d380-4888-8aa1-6048692416bd
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

{"handle":"qa-0b48550610ea","displayName":"QA 0b48550610ea","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-0b48550610ea
correlation: qa-5a5d490a-e25d-400d-b8bd-24bca716a8d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a5d490a-e25d-400d-b8bd-24bca716a8d0
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a5d490a-e25d-400d-b8bd-24bca716a8d0
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

{"handle":"qa-0b48550610ea","displayName":"QA 0b48550610ea","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-0b48550610ea
correlation: qa-3ca8786b-6d27-44a7-b6f5-2e83d29495bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ca8786b-6d27-44a7-b6f5-2e83d29495bb
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ca8786b-6d27-44a7-b6f5-2e83d29495bb
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

{"handle":"qa-0b48550610ea","displayName":"QA 0b48550610ea","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-ae0277e4-c2c9-4590-ba30-8f3b9baa6204

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae0277e4-c2c9-4590-ba30-8f3b9baa6204
Content-Type: application/json

--- request body ---
{"handle":"qa-0b48550610ea","password":"****"}

--- response: 200 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae0277e4-c2c9-4590-ba30-8f3b9baa6204
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4228b58d-eece-4462-97b6-1a328b2fcb73"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-46054ce5-4242-408c-9d78-7257c2c17143

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46054ce5-4242-408c-9d78-7257c2c17143
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-46054ce5-4242-408c-9d78-7257c2c17143
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
correlation: qa-e719d5fa-ebc7-41fb-b805-b14c3f319edb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e719d5fa-ebc7-41fb-b805-b14c3f319edb
Content-Type: application/json

--- request body ---
{"handle":"qa-0b48550610ea","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e719d5fa-ebc7-41fb-b805-b14c3f319edb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e719d5fa-ebc7-41fb-b805-b14c3f319edb"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7b6d40aa-eba3-4acb-8edc-58966b0720b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b6d40aa-eba3-4acb-8edc-58966b0720b5
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7b6d40aa-eba3-4acb-8edc-58966b0720b5
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
correlation: qa-ed4d7f3d-7e74-4592-b8f4-16447a2cb691

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed4d7f3d-7e74-4592-b8f4-16447a2cb691
Content-Type: application/json

--- request body ---
{"handle":"qa-722a259f6b45","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed4d7f3d-7e74-4592-b8f4-16447a2cb691
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ed4d7f3d-7e74-4592-b8f4-16447a2cb691"}
```
