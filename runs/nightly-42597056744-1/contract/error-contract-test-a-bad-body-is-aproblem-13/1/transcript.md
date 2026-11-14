# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-c409d947-6f5a-4cf6-ad9e-2a200a7105fa` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-8a308f22-1957-4978-9d56-763216f09f90` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-fa4eaf44-0db0-44d9-96f7-6c54ec4e92c2` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-51b35902-abc2-4a33-a135-e65f506eb2b7` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 7 | `qa-3b85eefb-fd7d-4396-8c91-e46078805b54` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-89b3c085-045e-425d-bae4-92d6db1d3300` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-99e34e53-f4e4-4ac4-b44c-cbd27f8aede0` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-e4bde4ce-36a5-4864-87ea-5aede096381d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-3e8974b1-4ffa-4471-8568-07a1a2c9f3e5` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-545dae23-77d9-4601-aef8-4bf30d16f309` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c409d947-6f5a-4cf6-ad9e-2a200a7105fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c409d947-6f5a-4cf6-ad9e-2a200a7105fa
Content-Type: application/json

--- request body ---
{"handle":"qa-e70d203da370","displayName":"QA e70d203da370","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c409d947-6f5a-4cf6-ad9e-2a200a7105fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Location: /v1/accounts/qa-e70d203da370
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8a9dd0a9-3eda-4e84-862f-1434d90f62f0","handle":"qa-e70d203da370","displayName":"QA e70d203da370","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.533729927Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8a308f22-1957-4978-9d56-763216f09f90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a308f22-1957-4978-9d56-763216f09f90
Content-Type: application/json

--- request body ---
{"handle":"qa-8358d95fa885","displayName":"QA 8358d95fa885","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a308f22-1957-4978-9d56-763216f09f90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 8
Location: /v1/accounts/qa-8358d95fa885
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bbf15c2a-195c-4c13-b777-7415d655045f","handle":"qa-8358d95fa885","displayName":"QA 8358d95fa885","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.578677119Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fa4eaf44-0db0-44d9-96f7-6c54ec4e92c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa4eaf44-0db0-44d9-96f7-6c54ec4e92c2
Content-Type: application/json

--- request body ---
{"handle":"qa-e70d203da370","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa4eaf44-0db0-44d9-96f7-6c54ec4e92c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8a9dd0a9-3eda-4e84-862f-1434d90f62f0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-51b35902-abc2-4a33-a135-e65f506eb2b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51b35902-abc2-4a33-a135-e65f506eb2b7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8358d95fa885","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-51b35902-abc2-4a33-a135-e65f506eb2b7
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
Location: /v1/conversations/cnv_34664881-01a7-406c-aacd-1754d092debc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_34664881-01a7-406c-aacd-1754d092debc","subject":"Error contract","status":"open","region":"eu","participants":["qa-e70d203da370","qa-8358d95fa885"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.645551811Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_34664881-01a7-406c-aacd-1754d092debc/messages
correlation: qa-3b85eefb-fd7d-4396-8c91-e46078805b54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b85eefb-fd7d-4396-8c91-e46078805b54
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b85eefb-fd7d-4396-8c91-e46078805b54
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_34664881-01a7-406c-aacd-1754d092debc/messages","correlationId":"qa-3b85eefb-fd7d-4396-8c91-e46078805b54"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-89b3c085-045e-425d-bae4-92d6db1d3300

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89b3c085-045e-425d-bae4-92d6db1d3300
Content-Type: application/json

--- request body ---
{"handle":"qa-8358d95fa885","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-89b3c085-045e-425d-bae4-92d6db1d3300
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bbf15c2a-195c-4c13-b777-7415d655045f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-99e34e53-f4e4-4ac4-b44c-cbd27f8aede0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99e34e53-f4e4-4ac4-b44c-cbd27f8aede0
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-99e34e53-f4e4-4ac4-b44c-cbd27f8aede0
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
correlation: qa-e4bde4ce-36a5-4864-87ea-5aede096381d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4bde4ce-36a5-4864-87ea-5aede096381d
Content-Type: application/json

--- request body ---
{"handle":"qa-8358d95fa885","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4bde4ce-36a5-4864-87ea-5aede096381d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e4bde4ce-36a5-4864-87ea-5aede096381d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3e8974b1-4ffa-4471-8568-07a1a2c9f3e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e8974b1-4ffa-4471-8568-07a1a2c9f3e5
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3e8974b1-4ffa-4471-8568-07a1a2c9f3e5
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
correlation: qa-545dae23-77d9-4601-aef8-4bf30d16f309

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-545dae23-77d9-4601-aef8-4bf30d16f309
Content-Type: application/json

--- request body ---
{"handle":"qa-e70d203da370","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-545dae23-77d9-4601-aef8-4bf30d16f309
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-545dae23-77d9-4601-aef8-4bf30d16f309"}
```
