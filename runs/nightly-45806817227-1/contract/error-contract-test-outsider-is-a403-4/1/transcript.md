# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 88 | `qa-54c26619-58d8-49e8-8395-79ea5cd3d6cb` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-c48fd38b-7061-4c65-8b43-1343e224f429` |
| 3 | `POST /v1/accounts` | 201 | 29 | `qa-6ff9a931-f8cf-4c48-a0c3-cdf76be24766` |
| 4 | `POST /v1/auth/token` | 200 | 37 | `qa-e4b6ebcf-9d45-4149-bfaa-6677cad9518b` |
| 5 | `POST /v1/conversations` | 201 | 13 | `qa-7feb697c-7c9a-471d-a557-737614ad56fe` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-9dc75fae-9978-4ce8-b20d-f48e968f39dc` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 8 | `qa-93e4683f-2c0c-417a-9b19-50fd0a3890af` |
| 8 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-75cb9a84-148a-4c70-8239-e91a28af1380` |
| 9 | `POST /v1/auth/token` | 401 | 19 | `qa-3cd268ea-199e-404d-8625-aa082a9d060a` |
| 10 | `POST /v1/auth/token` | 200 | 36 | `qa-303b1596-d733-409b-ad21-e60235a2cd7f` |
| 11 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-1ac4266e-c4fd-4bd3-80d8-381cd6d9db10` |
| 12 | `POST /v1/auth/token` | 401 | 25 | `qa-afbde3fc-0121-4d8f-9e1d-4f6555d87148` |
| 13 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-9efd4760-f148-4802-b755-e561f27d256a` |
| 14 | `POST /v1/auth/token` | 401 | 26 | `qa-993fec7e-e146-42d7-87d7-b7b20fdff0dd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-54c26619-58d8-49e8-8395-79ea5cd3d6cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54c26619-58d8-49e8-8395-79ea5cd3d6cb
Content-Type: application/json

--- request body ---
{"handle":"qa-6e88e836d342","displayName":"QA 6e88e836d342","password":"****","region":"eu"}

--- response: 201 in 88 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-54c26619-58d8-49e8-8395-79ea5cd3d6cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Location: /v1/accounts/qa-6e88e836d342
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f80392e4-1818-4c10-9d15-c698a5303ecc","handle":"qa-6e88e836d342","displayName":"QA 6e88e836d342","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.365552727Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c48fd38b-7061-4c65-8b43-1343e224f429

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c48fd38b-7061-4c65-8b43-1343e224f429
Content-Type: application/json

--- request body ---
{"handle":"qa-2ce8ab004c31","displayName":"QA 2ce8ab004c31","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-c48fd38b-7061-4c65-8b43-1343e224f429
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 7
Location: /v1/accounts/qa-2ce8ab004c31
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1bef161d-6e31-4c89-9f36-f03074820c56","handle":"qa-2ce8ab004c31","displayName":"QA 2ce8ab004c31","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.434954264Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-6ff9a931-f8cf-4c48-a0c3-cdf76be24766

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ff9a931-f8cf-4c48-a0c3-cdf76be24766
Content-Type: application/json

--- request body ---
{"handle":"qa-4bf56f22610d","displayName":"QA 4bf56f22610d","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ff9a931-f8cf-4c48-a0c3-cdf76be24766
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 7
Location: /v1/accounts/qa-4bf56f22610d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d5ba119-0b11-4423-8692-410e1862a76e","handle":"qa-4bf56f22610d","displayName":"QA 4bf56f22610d","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.496789281Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e4b6ebcf-9d45-4149-bfaa-6677cad9518b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4b6ebcf-9d45-4149-bfaa-6677cad9518b
Content-Type: application/json

--- request body ---
{"handle":"qa-6e88e836d342","password":"****"}

--- response: 200 in 37 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4b6ebcf-9d45-4149-bfaa-6677cad9518b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f80392e4-1818-4c10-9d15-c698a5303ecc"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-7feb697c-7c9a-471d-a557-737614ad56fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7feb697c-7c9a-471d-a557-737614ad56fe
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2ce8ab004c31","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-7feb697c-7c9a-471d-a557-737614ad56fe
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
Location: /v1/conversations/cnv_a77e7b82-6200-4a09-87fb-fc7f8f62bb14
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a77e7b82-6200-4a09-87fb-fc7f8f62bb14","subject":"Error contract","status":"open","region":"eu","participants":["qa-6e88e836d342","qa-2ce8ab004c31"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:45.579436831Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9dc75fae-9978-4ce8-b20d-f48e968f39dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dc75fae-9978-4ce8-b20d-f48e968f39dc
Content-Type: application/json

--- request body ---
{"handle":"qa-4bf56f22610d","password":"****"}

--- response: 200 in 38 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dc75fae-9978-4ce8-b20d-f48e968f39dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d5ba119-0b11-4423-8692-410e1862a76e"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_a77e7b82-6200-4a09-87fb-fc7f8f62bb14/close
correlation: qa-93e4683f-2c0c-417a-9b19-50fd0a3890af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93e4683f-2c0c-417a-9b19-50fd0a3890af
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93e4683f-2c0c-417a-9b19-50fd0a3890af
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a77e7b82-6200-4a09-87fb-fc7f8f62bb14/close","correlationId":"qa-93e4683f-2c0c-417a-9b19-50fd0a3890af"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-75cb9a84-148a-4c70-8239-e91a28af1380

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75cb9a84-148a-4c70-8239-e91a28af1380
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-75cb9a84-148a-4c70-8239-e91a28af1380
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
correlation: qa-3cd268ea-199e-404d-8625-aa082a9d060a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cd268ea-199e-404d-8625-aa082a9d060a
Content-Type: application/json

--- request body ---
{"handle":"qa-4bf56f22610d","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3cd268ea-199e-404d-8625-aa082a9d060a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3cd268ea-199e-404d-8625-aa082a9d060a"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-303b1596-d733-409b-ad21-e60235a2cd7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-303b1596-d733-409b-ad21-e60235a2cd7f
Content-Type: application/json

--- request body ---
{"handle":"qa-2ce8ab004c31","password":"****"}

--- response: 200 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-303b1596-d733-409b-ad21-e60235a2cd7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1bef161d-6e31-4c89-9f36-f03074820c56"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1ac4266e-c4fd-4bd3-80d8-381cd6d9db10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ac4266e-c4fd-4bd3-80d8-381cd6d9db10
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1ac4266e-c4fd-4bd3-80d8-381cd6d9db10
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
correlation: qa-afbde3fc-0121-4d8f-9e1d-4f6555d87148

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afbde3fc-0121-4d8f-9e1d-4f6555d87148
Content-Type: application/json

--- request body ---
{"handle":"qa-2ce8ab004c31","password":"****"}

--- response: 401 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-afbde3fc-0121-4d8f-9e1d-4f6555d87148
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-afbde3fc-0121-4d8f-9e1d-4f6555d87148"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9efd4760-f148-4802-b755-e561f27d256a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9efd4760-f148-4802-b755-e561f27d256a
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9efd4760-f148-4802-b755-e561f27d256a
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
correlation: qa-993fec7e-e146-42d7-87d7-b7b20fdff0dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-993fec7e-e146-42d7-87d7-b7b20fdff0dd
Content-Type: application/json

--- request body ---
{"handle":"qa-6e88e836d342","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-993fec7e-e146-42d7-87d7-b7b20fdff0dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-993fec7e-e146-42d7-87d7-b7b20fdff0dd"}
```
