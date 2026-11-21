# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-46963cb3-e4fd-469a-ae61-f6fe05a8d174` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-3cd43934-d973-4307-9f1d-b9751a26e111` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-b53f5a95-d72c-4607-9a32-e99105ffcd0f` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-acbd48ce-b364-4c56-b370-3a5d260560ee` |
| 5 | `POST /v1/auth/token` | 422 | 28 | `qa-afad8714-228a-4c8b-869c-2a793297ade3` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-2435740b-063f-41af-b86e-66c146e0878d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-3d666e7d-8bbb-47a1-b2f5-f574a0afc08b` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-99cc1a86-8931-403a-9ebe-66a59496f7b9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 55 | `qa-502f5a9d-7f98-429f-974c-1b15af6e0098` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-b88cbc77-b0fd-45db-826d-8a676805f032` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-46963cb3-e4fd-469a-ae61-f6fe05a8d174

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46963cb3-e4fd-469a-ae61-f6fe05a8d174
Content-Type: application/json

--- request body ---
{"handle":"qa-41d1936af390","displayName":"QA 41d1936af390","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-46963cb3-e4fd-469a-ae61-f6fe05a8d174
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Location: /v1/accounts/qa-41d1936af390
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7314844-7022-4027-aceb-9a486db77277","handle":"qa-41d1936af390","displayName":"QA 41d1936af390","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.094586534Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3cd43934-d973-4307-9f1d-b9751a26e111

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cd43934-d973-4307-9f1d-b9751a26e111
Content-Type: application/json

--- request body ---
{"handle":"qa-673d3e39ea75","displayName":"QA 673d3e39ea75","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cd43934-d973-4307-9f1d-b9751a26e111
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Location: /v1/accounts/qa-673d3e39ea75
X-Served-Region: eu
Content-Length: 181

{"id":"acc_567124f4-8a70-4735-bcff-b7376d03e531","handle":"qa-673d3e39ea75","displayName":"QA 673d3e39ea75","region":"eu","role":"user","createdAt":"2026-11-15T09:36:08.135194025Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b53f5a95-d72c-4607-9a32-e99105ffcd0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b53f5a95-d72c-4607-9a32-e99105ffcd0f
Content-Type: application/json

--- request body ---
{"handle":"qa-41d1936af390","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-b53f5a95-d72c-4607-9a32-e99105ffcd0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7314844-7022-4027-aceb-9a486db77277"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-acbd48ce-b364-4c56-b370-3a5d260560ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acbd48ce-b364-4c56-b370-3a5d260560ee
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-673d3e39ea75","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-acbd48ce-b364-4c56-b370-3a5d260560ee
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
Location: /v1/conversations/cnv_c98c1ea9-27e8-4b99-8056-3ef097ecb064
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c98c1ea9-27e8-4b99-8056-3ef097ecb064","subject":"Error contract","status":"open","region":"eu","participants":["qa-41d1936af390","qa-673d3e39ea75"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:08.192513078Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-afad8714-228a-4c8b-869c-2a793297ade3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afad8714-228a-4c8b-869c-2a793297ade3
Content-Type: application/json

--- request body ---
{"handle":"qa-41d1936af390","password":"****","ttlSeconds":0}

--- response: 422 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-afad8714-228a-4c8b-869c-2a793297ade3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-afad8714-228a-4c8b-869c-2a793297ade3","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2435740b-063f-41af-b86e-66c146e0878d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2435740b-063f-41af-b86e-66c146e0878d
Content-Type: application/json

--- request body ---
{"handle":"qa-673d3e39ea75","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-2435740b-063f-41af-b86e-66c146e0878d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_567124f4-8a70-4735-bcff-b7376d03e531"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3d666e7d-8bbb-47a1-b2f5-f574a0afc08b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d666e7d-8bbb-47a1-b2f5-f574a0afc08b
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3d666e7d-8bbb-47a1-b2f5-f574a0afc08b
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
correlation: qa-99cc1a86-8931-403a-9ebe-66a59496f7b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99cc1a86-8931-403a-9ebe-66a59496f7b9
Content-Type: application/json

--- request body ---
{"handle":"qa-673d3e39ea75","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99cc1a86-8931-403a-9ebe-66a59496f7b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-99cc1a86-8931-403a-9ebe-66a59496f7b9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-502f5a9d-7f98-429f-974c-1b15af6e0098

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-502f5a9d-7f98-429f-974c-1b15af6e0098
Content-Type: application/json

--- response: 204 in 55 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-502f5a9d-7f98-429f-974c-1b15af6e0098
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b88cbc77-b0fd-45db-826d-8a676805f032

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b88cbc77-b0fd-45db-826d-8a676805f032
Content-Type: application/json

--- request body ---
{"handle":"qa-41d1936af390","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b88cbc77-b0fd-45db-826d-8a676805f032
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b88cbc77-b0fd-45db-826d-8a676805f032"}
```
