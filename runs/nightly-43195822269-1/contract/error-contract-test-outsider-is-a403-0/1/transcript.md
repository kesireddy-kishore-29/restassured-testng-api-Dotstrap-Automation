# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-7669eae9-345f-4dfc-9fc9-b67d577a1ae6` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-d8d36910-2936-4496-a98e-75465407a64a` |
| 3 | `POST /v1/accounts` | 201 | 27 | `qa-2203dc04-ef89-4082-909a-668c0ae66589` |
| 4 | `POST /v1/auth/token` | 200 | 16 | `qa-64042979-a38b-4afb-a68e-7e1c3a823443` |
| 5 | `POST /v1/conversations` | 201 | 9 | `qa-d2c7b29c-d63a-4206-8b02-8fb84c350a9d` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-eeb23e0e-8126-455a-9fe6-6a7f0737f881` |
| 7 | `GET /v1/conversations/{id}` | 403 | 9 | `qa-805ea0c7-fb20-491a-baa4-0401f15acb34` |
| 8 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-dec3d0da-15c6-4747-b018-30d911f31031` |
| 9 | `POST /v1/auth/token` | 401 | 42 | `qa-8016052e-7edd-483d-9efc-8e82a881591c` |
| 10 | `POST /v1/auth/token` | 200 | 21 | `qa-c1f7078f-e886-4d28-b1e0-9db054038d4f` |
| 11 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-1021ff35-5279-47dc-93a9-b409e82546be` |
| 12 | `POST /v1/auth/token` | 401 | 20 | `qa-a4cbb96e-393e-4976-a045-025822ab5341` |
| 13 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-da955006-ef17-41e0-ba5a-5869db656fcc` |
| 14 | `POST /v1/auth/token` | 401 | 15 | `qa-2389b6b2-5b73-4e27-8f56-2bfd224b41b8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7669eae9-345f-4dfc-9fc9-b67d577a1ae6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7669eae9-345f-4dfc-9fc9-b67d577a1ae6
Content-Type: application/json

--- request body ---
{"handle":"qa-5ec34dc55630","displayName":"QA 5ec34dc55630","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-7669eae9-345f-4dfc-9fc9-b67d577a1ae6
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
Location: /v1/accounts/qa-5ec34dc55630
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9b4c920-0f7d-4858-a883-49c3c40f793e","handle":"qa-5ec34dc55630","displayName":"QA 5ec34dc55630","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.072468592Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d8d36910-2936-4496-a98e-75465407a64a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8d36910-2936-4496-a98e-75465407a64a
Content-Type: application/json

--- request body ---
{"handle":"qa-09ceb5e0d01b","displayName":"QA 09ceb5e0d01b","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8d36910-2936-4496-a98e-75465407a64a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 10
Location: /v1/accounts/qa-09ceb5e0d01b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_55fb2fea-8cf3-4209-bc91-63847a7e0358","handle":"qa-09ceb5e0d01b","displayName":"QA 09ceb5e0d01b","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.115458792Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-2203dc04-ef89-4082-909a-668c0ae66589

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2203dc04-ef89-4082-909a-668c0ae66589
Content-Type: application/json

--- request body ---
{"handle":"qa-543350e49b9a","displayName":"QA 543350e49b9a","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-2203dc04-ef89-4082-909a-668c0ae66589
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 10
Location: /v1/accounts/qa-543350e49b9a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4c69c6b8-b4e5-4b54-b138-5b5a79b4be61","handle":"qa-543350e49b9a","displayName":"QA 543350e49b9a","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.140949874Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-64042979-a38b-4afb-a68e-7e1c3a823443

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64042979-a38b-4afb-a68e-7e1c3a823443
Content-Type: application/json

--- request body ---
{"handle":"qa-5ec34dc55630","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-64042979-a38b-4afb-a68e-7e1c3a823443
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a9b4c920-0f7d-4858-a883-49c3c40f793e"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d2c7b29c-d63a-4206-8b02-8fb84c350a9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2c7b29c-d63a-4206-8b02-8fb84c350a9d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-09ceb5e0d01b","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2c7b29c-d63a-4206-8b02-8fb84c350a9d
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
Location: /v1/conversations/cnv_519d7ec6-1324-4a7f-be25-0ba3f56255ce
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_519d7ec6-1324-4a7f-be25-0ba3f56255ce","subject":"Error contract","status":"open","region":"eu","participants":["qa-5ec34dc55630","qa-09ceb5e0d01b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:30.220136694Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eeb23e0e-8126-455a-9fe6-6a7f0737f881

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eeb23e0e-8126-455a-9fe6-6a7f0737f881
Content-Type: application/json

--- request body ---
{"handle":"qa-543350e49b9a","password":"****"}

--- response: 200 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-eeb23e0e-8126-455a-9fe6-6a7f0737f881
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4c69c6b8-b4e5-4b54-b138-5b5a79b4be61"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_519d7ec6-1324-4a7f-be25-0ba3f56255ce
correlation: qa-805ea0c7-fb20-491a-baa4-0401f15acb34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-805ea0c7-fb20-491a-baa4-0401f15acb34
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-805ea0c7-fb20-491a-baa4-0401f15acb34
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_519d7ec6-1324-4a7f-be25-0ba3f56255ce","correlationId":"qa-805ea0c7-fb20-491a-baa4-0401f15acb34"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dec3d0da-15c6-4747-b018-30d911f31031

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dec3d0da-15c6-4747-b018-30d911f31031
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dec3d0da-15c6-4747-b018-30d911f31031
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
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-8016052e-7edd-483d-9efc-8e82a881591c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8016052e-7edd-483d-9efc-8e82a881591c
Content-Type: application/json

--- request body ---
{"handle":"qa-543350e49b9a","password":"****"}

--- response: 401 in 42 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8016052e-7edd-483d-9efc-8e82a881591c
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8016052e-7edd-483d-9efc-8e82a881591c"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c1f7078f-e886-4d28-b1e0-9db054038d4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1f7078f-e886-4d28-b1e0-9db054038d4f
Content-Type: application/json

--- request body ---
{"handle":"qa-09ceb5e0d01b","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1f7078f-e886-4d28-b1e0-9db054038d4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_55fb2fea-8cf3-4209-bc91-63847a7e0358"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1021ff35-5279-47dc-93a9-b409e82546be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1021ff35-5279-47dc-93a9-b409e82546be
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1021ff35-5279-47dc-93a9-b409e82546be
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-a4cbb96e-393e-4976-a045-025822ab5341

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4cbb96e-393e-4976-a045-025822ab5341
Content-Type: application/json

--- request body ---
{"handle":"qa-09ceb5e0d01b","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4cbb96e-393e-4976-a045-025822ab5341
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4cbb96e-393e-4976-a045-025822ab5341"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-da955006-ef17-41e0-ba5a-5869db656fcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da955006-ef17-41e0-ba5a-5869db656fcc
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-da955006-ef17-41e0-ba5a-5869db656fcc
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-2389b6b2-5b73-4e27-8f56-2bfd224b41b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2389b6b2-5b73-4e27-8f56-2bfd224b41b8
Content-Type: application/json

--- request body ---
{"handle":"qa-5ec34dc55630","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2389b6b2-5b73-4e27-8f56-2bfd224b41b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2389b6b2-5b73-4e27-8f56-2bfd224b41b8"}
```
