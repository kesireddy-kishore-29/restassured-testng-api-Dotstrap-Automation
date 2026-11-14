# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-12be1e27-d522-4e36-8f48-56e5062d9269` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-17d7d512-34ce-45e7-a30c-468f144a1ddf` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-1edfccd2-08bb-4f49-98d3-d302c9dc60f9` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-5df086b1-86ba-406c-923d-5eadcda1119b` |
| 5 | `POST /v1/conversations` | 422 | 9 | `qa-9c37709b-de04-4787-b346-7169b72c80cd` |
| 6 | `POST /v1/auth/token` | 200 | 8 | `qa-d33dcf1f-c956-4922-956b-afe9fa77657e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-2dc8f904-8f65-4aad-a3e4-8acab28874a5` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-d654c7b3-0ce3-40fb-8687-64a47ab20a66` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-02698c2e-e742-491f-8130-a62583ed4779` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-227147bd-344b-4d60-8d90-1e9efcb8890a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-12be1e27-d522-4e36-8f48-56e5062d9269

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12be1e27-d522-4e36-8f48-56e5062d9269
Content-Type: application/json

--- request body ---
{"handle":"qa-d58c3fed3e35","displayName":"QA d58c3fed3e35","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-12be1e27-d522-4e36-8f48-56e5062d9269
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Location: /v1/accounts/qa-d58c3fed3e35
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9b5a2ca-10fa-4e52-8df8-3cedf2a67ec5","handle":"qa-d58c3fed3e35","displayName":"QA d58c3fed3e35","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.337023909Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-17d7d512-34ce-45e7-a30c-468f144a1ddf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17d7d512-34ce-45e7-a30c-468f144a1ddf
Content-Type: application/json

--- request body ---
{"handle":"qa-095b7c59647a","displayName":"QA 095b7c59647a","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-17d7d512-34ce-45e7-a30c-468f144a1ddf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 8
Location: /v1/accounts/qa-095b7c59647a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8329971b-eda5-4304-9094-777a7b140041","handle":"qa-095b7c59647a","displayName":"QA 095b7c59647a","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.358947193Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1edfccd2-08bb-4f49-98d3-d302c9dc60f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1edfccd2-08bb-4f49-98d3-d302c9dc60f9
Content-Type: application/json

--- request body ---
{"handle":"qa-d58c3fed3e35","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1edfccd2-08bb-4f49-98d3-d302c9dc60f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9b5a2ca-10fa-4e52-8df8-3cedf2a67ec5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5df086b1-86ba-406c-923d-5eadcda1119b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5df086b1-86ba-406c-923d-5eadcda1119b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-095b7c59647a","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5df086b1-86ba-406c-923d-5eadcda1119b
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
Location: /v1/conversations/cnv_44c89da9-b559-4b08-b423-d05081a5d3d4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_44c89da9-b559-4b08-b423-d05081a5d3d4","subject":"Error contract","status":"open","region":"eu","participants":["qa-d58c3fed3e35","qa-095b7c59647a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.405623215Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9c37709b-de04-4787-b346-7169b72c80cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c37709b-de04-4787-b346-7169b72c80cd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-095b7c59647a","subject":" ","message":"Hi"}

--- response: 422 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c37709b-de04-4787-b346-7169b72c80cd
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-9c37709b-de04-4787-b346-7169b72c80cd","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d33dcf1f-c956-4922-956b-afe9fa77657e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d33dcf1f-c956-4922-956b-afe9fa77657e
Content-Type: application/json

--- request body ---
{"handle":"qa-095b7c59647a","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d33dcf1f-c956-4922-956b-afe9fa77657e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8329971b-eda5-4304-9094-777a7b140041"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2dc8f904-8f65-4aad-a3e4-8acab28874a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dc8f904-8f65-4aad-a3e4-8acab28874a5
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2dc8f904-8f65-4aad-a3e4-8acab28874a5
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
correlation: qa-d654c7b3-0ce3-40fb-8687-64a47ab20a66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d654c7b3-0ce3-40fb-8687-64a47ab20a66
Content-Type: application/json

--- request body ---
{"handle":"qa-095b7c59647a","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d654c7b3-0ce3-40fb-8687-64a47ab20a66
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d654c7b3-0ce3-40fb-8687-64a47ab20a66"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-02698c2e-e742-491f-8130-a62583ed4779

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02698c2e-e742-491f-8130-a62583ed4779
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-02698c2e-e742-491f-8130-a62583ed4779
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
correlation: qa-227147bd-344b-4d60-8d90-1e9efcb8890a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-227147bd-344b-4d60-8d90-1e9efcb8890a
Content-Type: application/json

--- request body ---
{"handle":"qa-d58c3fed3e35","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-227147bd-344b-4d60-8d90-1e9efcb8890a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-227147bd-344b-4d60-8d90-1e9efcb8890a"}
```
