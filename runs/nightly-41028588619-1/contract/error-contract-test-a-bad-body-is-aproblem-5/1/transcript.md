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
| 1 | `POST /v1/accounts` | 201 | 50 | `qa-270c63b0-b7e5-40dc-bf38-42a4df48a8b9` |
| 2 | `POST /v1/accounts` | 201 | 57 | `qa-2bda6497-56cc-475f-b800-99d918d09315` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-24f18580-5a57-4ef9-b10e-03309c3134d4` |
| 4 | `POST /v1/conversations` | 201 | 47 | `qa-0e707c8c-55ee-4a51-b9dd-028e18f92352` |
| 5 | `POST /v1/accounts` | 422 | 19 | `qa-17387688-5560-422d-bf72-20380bbd7c96` |
| 6 | `POST /v1/auth/token` | 200 | 55 | `qa-54c38920-6b8a-4c6d-9a18-7964bb4a736e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-c5ed3ec8-ca64-4b28-a299-f218752d7c3c` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-96865fa5-c1ae-41b1-bdab-b475faa03f26` |
| 9 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-d351128e-bbe5-45eb-876a-0a8bcccfcee2` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-9b9c4670-9136-48aa-8660-c68b12e35dfe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-270c63b0-b7e5-40dc-bf38-42a4df48a8b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-270c63b0-b7e5-40dc-bf38-42a4df48a8b9
Content-Type: application/json

--- request body ---
{"handle":"qa-8ff27d64b6ee","displayName":"QA 8ff27d64b6ee","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-270c63b0-b7e5-40dc-bf38-42a4df48a8b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Location: /v1/accounts/qa-8ff27d64b6ee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9eba4ad5-37ef-40b5-a596-e82fa7812ada","handle":"qa-8ff27d64b6ee","displayName":"QA 8ff27d64b6ee","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.814850676Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2bda6497-56cc-475f-b800-99d918d09315

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bda6497-56cc-475f-b800-99d918d09315
Content-Type: application/json

--- request body ---
{"handle":"qa-6c4220e152d5","displayName":"QA 6c4220e152d5","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bda6497-56cc-475f-b800-99d918d09315
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Location: /v1/accounts/qa-6c4220e152d5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b33e7eee-9d26-46df-8bc9-314a7df9c18d","handle":"qa-6c4220e152d5","displayName":"QA 6c4220e152d5","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.917600642Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-24f18580-5a57-4ef9-b10e-03309c3134d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24f18580-5a57-4ef9-b10e-03309c3134d4
Content-Type: application/json

--- request body ---
{"handle":"qa-8ff27d64b6ee","password":"****"}

--- response: 200 in 33 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-24f18580-5a57-4ef9-b10e-03309c3134d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9eba4ad5-37ef-40b5-a596-e82fa7812ada"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0e707c8c-55ee-4a51-b9dd-028e18f92352

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e707c8c-55ee-4a51-b9dd-028e18f92352
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6c4220e152d5","subject":"Error contract","message":"Hi"}

--- response: 201 in 47 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e707c8c-55ee-4a51-b9dd-028e18f92352
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
Location: /v1/conversations/cnv_6e1da16d-194f-480c-acd6-d14373a16147
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6e1da16d-194f-480c-acd6-d14373a16147","subject":"Error contract","status":"open","region":"eu","participants":["qa-8ff27d64b6ee","qa-6c4220e152d5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.055335526Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-17387688-5560-422d-bf72-20380bbd7c96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17387688-5560-422d-bf72-20380bbd7c96
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17387688-5560-422d-bf72-20380bbd7c96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-17387688-5560-422d-bf72-20380bbd7c96","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-54c38920-6b8a-4c6d-9a18-7964bb4a736e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54c38920-6b8a-4c6d-9a18-7964bb4a736e
Content-Type: application/json

--- request body ---
{"handle":"qa-6c4220e152d5","password":"****"}

--- response: 200 in 55 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-54c38920-6b8a-4c6d-9a18-7964bb4a736e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b33e7eee-9d26-46df-8bc9-314a7df9c18d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c5ed3ec8-ca64-4b28-a299-f218752d7c3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5ed3ec8-ca64-4b28-a299-f218752d7c3c
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c5ed3ec8-ca64-4b28-a299-f218752d7c3c
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
correlation: qa-96865fa5-c1ae-41b1-bdab-b475faa03f26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96865fa5-c1ae-41b1-bdab-b475faa03f26
Content-Type: application/json

--- request body ---
{"handle":"qa-6c4220e152d5","password":"****"}

--- response: 401 in 26 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96865fa5-c1ae-41b1-bdab-b475faa03f26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-96865fa5-c1ae-41b1-bdab-b475faa03f26"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d351128e-bbe5-45eb-876a-0a8bcccfcee2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d351128e-bbe5-45eb-876a-0a8bcccfcee2
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d351128e-bbe5-45eb-876a-0a8bcccfcee2
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
correlation: qa-9b9c4670-9136-48aa-8660-c68b12e35dfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b9c4670-9136-48aa-8660-c68b12e35dfe
Content-Type: application/json

--- request body ---
{"handle":"qa-8ff27d64b6ee","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b9c4670-9136-48aa-8660-c68b12e35dfe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9b9c4670-9136-48aa-8660-c68b12e35dfe"}
```
