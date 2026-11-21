# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-c2b4e164-4f74-4dd0-b6e6-9fd0c3aabe42` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-69767848-03c0-42e3-acb2-4b7da589e55c` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-b020c278-3f3f-49a1-920d-1e5abe7964f4` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-db981295-7cc3-465f-a2d8-10d145ed14a8` |
| 5 | `PATCH /v1/accounts/me` | 415 | 8 | `qa-882e0516-bc9e-4de5-9571-de011447108d` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-bc8253eb-261a-43c5-9844-77c7e61db126` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-aceabc6b-0e13-4af2-9a6c-c5e4d1e9d4e1` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-3e5a3ab6-2666-4955-8ae2-c2bbb01aa5cd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-6b9e7f27-d154-4b6e-8cde-4f3a9fc6ca13` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-d1289ad2-eec8-4604-81e9-46133db1831e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c2b4e164-4f74-4dd0-b6e6-9fd0c3aabe42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2b4e164-4f74-4dd0-b6e6-9fd0c3aabe42
Content-Type: application/json

--- request body ---
{"handle":"qa-94ad72c89749","displayName":"QA 94ad72c89749","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2b4e164-4f74-4dd0-b6e6-9fd0c3aabe42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Location: /v1/accounts/qa-94ad72c89749
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7865f325-c9d3-4e03-80fa-2c49cc9a7106","handle":"qa-94ad72c89749","displayName":"QA 94ad72c89749","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.737608972Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-69767848-03c0-42e3-acb2-4b7da589e55c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69767848-03c0-42e3-acb2-4b7da589e55c
Content-Type: application/json

--- request body ---
{"handle":"qa-fda2c0be5bac","displayName":"QA fda2c0be5bac","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-69767848-03c0-42e3-acb2-4b7da589e55c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Location: /v1/accounts/qa-fda2c0be5bac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bbde90d4-413c-4e42-94b4-71828a36c158","handle":"qa-fda2c0be5bac","displayName":"QA fda2c0be5bac","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.773868718Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b020c278-3f3f-49a1-920d-1e5abe7964f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b020c278-3f3f-49a1-920d-1e5abe7964f4
Content-Type: application/json

--- request body ---
{"handle":"qa-94ad72c89749","password":"****"}

--- response: 200 in 38 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b020c278-3f3f-49a1-920d-1e5abe7964f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7865f325-c9d3-4e03-80fa-2c49cc9a7106"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-db981295-7cc3-465f-a2d8-10d145ed14a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db981295-7cc3-465f-a2d8-10d145ed14a8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fda2c0be5bac","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-db981295-7cc3-465f-a2d8-10d145ed14a8
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
Location: /v1/conversations/cnv_35bc51a1-1463-4cea-92c6-f992efdee9d9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_35bc51a1-1463-4cea-92c6-f992efdee9d9","subject":"Error contract","status":"open","region":"eu","participants":["qa-94ad72c89749","qa-fda2c0be5bac"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:51.878840999Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-882e0516-bc9e-4de5-9571-de011447108d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-882e0516-bc9e-4de5-9571-de011447108d
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-882e0516-bc9e-4de5-9571-de011447108d
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-882e0516-bc9e-4de5-9571-de011447108d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bc8253eb-261a-43c5-9844-77c7e61db126

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc8253eb-261a-43c5-9844-77c7e61db126
Content-Type: application/json

--- request body ---
{"handle":"qa-fda2c0be5bac","password":"****"}

--- response: 200 in 30 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc8253eb-261a-43c5-9844-77c7e61db126
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bbde90d4-413c-4e42-94b4-71828a36c158"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aceabc6b-0e13-4af2-9a6c-c5e4d1e9d4e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aceabc6b-0e13-4af2-9a6c-c5e4d1e9d4e1
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aceabc6b-0e13-4af2-9a6c-c5e4d1e9d4e1
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
correlation: qa-3e5a3ab6-2666-4955-8ae2-c2bbb01aa5cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e5a3ab6-2666-4955-8ae2-c2bbb01aa5cd
Content-Type: application/json

--- request body ---
{"handle":"qa-fda2c0be5bac","password":"****"}

--- response: 401 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e5a3ab6-2666-4955-8ae2-c2bbb01aa5cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3e5a3ab6-2666-4955-8ae2-c2bbb01aa5cd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6b9e7f27-d154-4b6e-8cde-4f3a9fc6ca13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b9e7f27-d154-4b6e-8cde-4f3a9fc6ca13
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6b9e7f27-d154-4b6e-8cde-4f3a9fc6ca13
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d1289ad2-eec8-4604-81e9-46133db1831e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1289ad2-eec8-4604-81e9-46133db1831e
Content-Type: application/json

--- request body ---
{"handle":"qa-94ad72c89749","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1289ad2-eec8-4604-81e9-46133db1831e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d1289ad2-eec8-4604-81e9-46133db1831e"}
```
