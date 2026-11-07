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
| 1 | `POST /v1/accounts` | 201 | 410 | `qa-758a63b6-beb3-4345-b358-19eeb7cf56ff` |
| 2 | `POST /v1/accounts` | 201 | 54 | `qa-219b83b4-1409-478f-b18e-16c1ec3a23e8` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-1c1c3106-ff5f-4343-9e62-cbe801e228ff` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 56 | `qa-64ced304-038f-4b46-8cf5-0439c834e797` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 22 | `qa-52831795-5866-4154-855e-e12afc4df739` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 24 | `qa-b3ec1d51-deff-4278-829b-bcd0232c430d` |
| 7 | `POST /v1/auth/token` | 200 | 21 | `qa-fd768d5c-fecd-417c-b046-604a855b45d4` |
| 8 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-0b2015ad-d081-4899-9b85-d6534d3852a8` |
| 9 | `POST /v1/auth/token` | 401 | 21 | `qa-38c34e76-1689-45dc-92aa-766515e897ed` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-0c8e67a4-db4e-4d92-9e65-c780b06c88ca` |
| 11 | `POST /v1/auth/token` | 401 | 18 | `qa-89e44973-bbf7-4083-bd53-f4b0760fb04f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-758a63b6-beb3-4345-b358-19eeb7cf56ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-758a63b6-beb3-4345-b358-19eeb7cf56ff
Content-Type: application/json

--- request body ---
{"handle":"qa-af4e17ebe6ec","displayName":"QA af4e17ebe6ec","password":"****","region":"eu"}

--- response: 201 in 410 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-758a63b6-beb3-4345-b358-19eeb7cf56ff
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
Location: /v1/accounts/qa-af4e17ebe6ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b3f039f8-11c4-4194-90cb-1122873494bb","handle":"qa-af4e17ebe6ec","displayName":"QA af4e17ebe6ec","region":"eu","role":"user","createdAt":"2026-11-03T09:41:46.226084716Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-219b83b4-1409-478f-b18e-16c1ec3a23e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-219b83b4-1409-478f-b18e-16c1ec3a23e8
Content-Type: application/json

--- request body ---
{"handle":"qa-d84ef8e5ea30","displayName":"QA d84ef8e5ea30","password":"****","region":"us"}

--- response: 201 in 54 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-219b83b4-1409-478f-b18e-16c1ec3a23e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-d84ef8e5ea30
X-Served-Region: us
Content-Length: 181

{"id":"acc_720cf1cb-af4d-4bbf-b14e-9bcd4f756057","handle":"qa-d84ef8e5ea30","displayName":"QA d84ef8e5ea30","region":"us","role":"user","createdAt":"2026-11-03T09:41:46.664262096Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1c1c3106-ff5f-4343-9e62-cbe801e228ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c1c3106-ff5f-4343-9e62-cbe801e228ff
Content-Type: application/json

--- request body ---
{"handle":"qa-af4e17ebe6ec","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c1c3106-ff5f-4343-9e62-cbe801e228ff
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3f039f8-11c4-4194-90cb-1122873494bb"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-d84ef8e5ea30
correlation: qa-64ced304-038f-4b46-8cf5-0439c834e797

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64ced304-038f-4b46-8cf5-0439c834e797
Content-Type: application/json

--- response: 200 in 56 ms ---
Date: Tue, 03 Nov 2026 09:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-64ced304-038f-4b46-8cf5-0439c834e797
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

{"handle":"qa-d84ef8e5ea30","displayName":"QA d84ef8e5ea30","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-d84ef8e5ea30
correlation: qa-52831795-5866-4154-855e-e12afc4df739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52831795-5866-4154-855e-e12afc4df739
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-52831795-5866-4154-855e-e12afc4df739
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

{"handle":"qa-d84ef8e5ea30","displayName":"QA d84ef8e5ea30","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-d84ef8e5ea30
correlation: qa-b3ec1d51-deff-4278-829b-bcd0232c430d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3ec1d51-deff-4278-829b-bcd0232c430d
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3ec1d51-deff-4278-829b-bcd0232c430d
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

{"handle":"qa-d84ef8e5ea30","displayName":"QA d84ef8e5ea30","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-fd768d5c-fecd-417c-b046-604a855b45d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd768d5c-fecd-417c-b046-604a855b45d4
Content-Type: application/json

--- request body ---
{"handle":"qa-d84ef8e5ea30","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd768d5c-fecd-417c-b046-604a855b45d4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_720cf1cb-af4d-4bbf-b14e-9bcd4f756057"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b2015ad-d081-4899-9b85-d6534d3852a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b2015ad-d081-4899-9b85-d6534d3852a8
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b2015ad-d081-4899-9b85-d6534d3852a8
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
correlation: qa-38c34e76-1689-45dc-92aa-766515e897ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38c34e76-1689-45dc-92aa-766515e897ed
Content-Type: application/json

--- request body ---
{"handle":"qa-d84ef8e5ea30","password":"****"}

--- response: 401 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38c34e76-1689-45dc-92aa-766515e897ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-38c34e76-1689-45dc-92aa-766515e897ed"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c8e67a4-db4e-4d92-9e65-c780b06c88ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c8e67a4-db4e-4d92-9e65-c780b06c88ca
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c8e67a4-db4e-4d92-9e65-c780b06c88ca
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
correlation: qa-89e44973-bbf7-4083-bd53-f4b0760fb04f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89e44973-bbf7-4083-bd53-f4b0760fb04f
Content-Type: application/json

--- request body ---
{"handle":"qa-af4e17ebe6ec","password":"****"}

--- response: 401 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89e44973-bbf7-4083-bd53-f4b0760fb04f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-89e44973-bbf7-4083-bd53-f4b0760fb04f"}
```
