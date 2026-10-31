# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-26910308-3b1a-424c-98a8-a4b1df143e14` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-f897c682-2506-46fb-b711-40576f28a21d` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-bd350137-3723-46ed-ac71-3c85977edabb` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-30d21dc6-0639-4b63-b417-37df54bb087b` |
| 5 | `POST /v1/accounts` | 422 | 7 | `qa-15ba2259-6d29-49c6-8881-e29e4181a87c` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-0bc481c0-b2a0-4c47-a4d2-f37fb4459a79` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-5a1f5c5d-6231-4aa7-97cd-9569f0f06f10` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-617b8135-59a7-41c3-8648-48f57d6907eb` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-c44aa61a-525c-4b35-bde4-ccc5a8ed4e27` |
| 10 | `POST /v1/auth/token` | 401 | 33 | `qa-03807523-eb4b-4325-9424-ca987f4877b2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-26910308-3b1a-424c-98a8-a4b1df143e14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26910308-3b1a-424c-98a8-a4b1df143e14
Content-Type: application/json

--- request body ---
{"handle":"qa-e0bf01070543","displayName":"QA e0bf01070543","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-26910308-3b1a-424c-98a8-a4b1df143e14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Location: /v1/accounts/qa-e0bf01070543
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2de00578-d6e4-40d3-b27c-37e24736dc5f","handle":"qa-e0bf01070543","displayName":"QA e0bf01070543","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.475407816Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f897c682-2506-46fb-b711-40576f28a21d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f897c682-2506-46fb-b711-40576f28a21d
Content-Type: application/json

--- request body ---
{"handle":"qa-df6f88c66ea7","displayName":"QA df6f88c66ea7","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-f897c682-2506-46fb-b711-40576f28a21d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 7
Location: /v1/accounts/qa-df6f88c66ea7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8c394f4e-65b7-4302-946e-766926dc75b0","handle":"qa-df6f88c66ea7","displayName":"QA df6f88c66ea7","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.542110374Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bd350137-3723-46ed-ac71-3c85977edabb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd350137-3723-46ed-ac71-3c85977edabb
Content-Type: application/json

--- request body ---
{"handle":"qa-e0bf01070543","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd350137-3723-46ed-ac71-3c85977edabb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2de00578-d6e4-40d3-b27c-37e24736dc5f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-30d21dc6-0639-4b63-b417-37df54bb087b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30d21dc6-0639-4b63-b417-37df54bb087b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-df6f88c66ea7","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-30d21dc6-0639-4b63-b417-37df54bb087b
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
Location: /v1/conversations/cnv_e21e89ef-9d1c-48b9-926e-330eb8e75fd5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e21e89ef-9d1c-48b9-926e-330eb8e75fd5","subject":"Error contract","status":"open","region":"eu","participants":["qa-e0bf01070543","qa-df6f88c66ea7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:45.655314838Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-15ba2259-6d29-49c6-8881-e29e4181a87c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15ba2259-6d29-49c6-8881-e29e4181a87c
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15ba2259-6d29-49c6-8881-e29e4181a87c
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
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-15ba2259-6d29-49c6-8881-e29e4181a87c","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0bc481c0-b2a0-4c47-a4d2-f37fb4459a79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bc481c0-b2a0-4c47-a4d2-f37fb4459a79
Content-Type: application/json

--- request body ---
{"handle":"qa-df6f88c66ea7","password":"****"}

--- response: 200 in 40 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bc481c0-b2a0-4c47-a4d2-f37fb4459a79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8c394f4e-65b7-4302-946e-766926dc75b0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5a1f5c5d-6231-4aa7-97cd-9569f0f06f10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a1f5c5d-6231-4aa7-97cd-9569f0f06f10
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5a1f5c5d-6231-4aa7-97cd-9569f0f06f10
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
correlation: qa-617b8135-59a7-41c3-8648-48f57d6907eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-617b8135-59a7-41c3-8648-48f57d6907eb
Content-Type: application/json

--- request body ---
{"handle":"qa-df6f88c66ea7","password":"****"}

--- response: 401 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-617b8135-59a7-41c3-8648-48f57d6907eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-617b8135-59a7-41c3-8648-48f57d6907eb"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c44aa61a-525c-4b35-bde4-ccc5a8ed4e27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c44aa61a-525c-4b35-bde4-ccc5a8ed4e27
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c44aa61a-525c-4b35-bde4-ccc5a8ed4e27
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-03807523-eb4b-4325-9424-ca987f4877b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03807523-eb4b-4325-9424-ca987f4877b2
Content-Type: application/json

--- request body ---
{"handle":"qa-e0bf01070543","password":"****"}

--- response: 401 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03807523-eb4b-4325-9424-ca987f4877b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03807523-eb4b-4325-9424-ca987f4877b2"}
```
