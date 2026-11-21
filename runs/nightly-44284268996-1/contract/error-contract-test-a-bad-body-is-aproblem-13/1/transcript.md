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
| 1 | `POST /v1/accounts` | 201 | 55 | `qa-cdd70699-4253-4372-ab29-70a558d6a82a` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-3482b2fe-2dee-4bef-aba1-afaa279a8fb8` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-1970ebeb-fd8b-470e-9f93-99448b1ec9a8` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-21fa652a-a262-4a10-81b0-7c80b73a74fe` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 9 | `qa-1024b06e-cca5-44eb-aeae-706558bb4f48` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-52b54bcf-b3cf-4386-880e-8b04a63d67ff` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-55ee689c-e146-4289-af32-b503ca9a2e25` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-83221565-cc43-486d-b254-517674178125` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-028ca564-e925-453c-be6d-ddf19188b5b9` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-a4f96539-c8f4-4d75-8545-c96078740d9b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cdd70699-4253-4372-ab29-70a558d6a82a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdd70699-4253-4372-ab29-70a558d6a82a
Content-Type: application/json

--- request body ---
{"handle":"qa-ccf6e4ed6150","displayName":"QA ccf6e4ed6150","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdd70699-4253-4372-ab29-70a558d6a82a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 7
Location: /v1/accounts/qa-ccf6e4ed6150
X-Served-Region: eu
Content-Length: 181

{"id":"acc_16fbb18b-bdb4-45b9-8219-1a97a5250727","handle":"qa-ccf6e4ed6150","displayName":"QA ccf6e4ed6150","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.651493806Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3482b2fe-2dee-4bef-aba1-afaa279a8fb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3482b2fe-2dee-4bef-aba1-afaa279a8fb8
Content-Type: application/json

--- request body ---
{"handle":"qa-18c53fded6ec","displayName":"QA 18c53fded6ec","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3482b2fe-2dee-4bef-aba1-afaa279a8fb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Location: /v1/accounts/qa-18c53fded6ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72750e95-a618-4e47-851e-a8caed59659e","handle":"qa-18c53fded6ec","displayName":"QA 18c53fded6ec","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.707755880Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1970ebeb-fd8b-470e-9f93-99448b1ec9a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1970ebeb-fd8b-470e-9f93-99448b1ec9a8
Content-Type: application/json

--- request body ---
{"handle":"qa-ccf6e4ed6150","password":"****"}

--- response: 200 in 42 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1970ebeb-fd8b-470e-9f93-99448b1ec9a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_16fbb18b-bdb4-45b9-8219-1a97a5250727"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-21fa652a-a262-4a10-81b0-7c80b73a74fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21fa652a-a262-4a10-81b0-7c80b73a74fe
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-18c53fded6ec","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-21fa652a-a262-4a10-81b0-7c80b73a74fe
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
Location: /v1/conversations/cnv_9c55dd91-aa5d-4517-910f-fca1284186e7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9c55dd91-aa5d-4517-910f-fca1284186e7","subject":"Error contract","status":"open","region":"eu","participants":["qa-ccf6e4ed6150","qa-18c53fded6ec"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.786013765Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_9c55dd91-aa5d-4517-910f-fca1284186e7/messages
correlation: qa-1024b06e-cca5-44eb-aeae-706558bb4f48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1024b06e-cca5-44eb-aeae-706558bb4f48
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1024b06e-cca5-44eb-aeae-706558bb4f48
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_9c55dd91-aa5d-4517-910f-fca1284186e7/messages","correlationId":"qa-1024b06e-cca5-44eb-aeae-706558bb4f48"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-52b54bcf-b3cf-4386-880e-8b04a63d67ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52b54bcf-b3cf-4386-880e-8b04a63d67ff
Content-Type: application/json

--- request body ---
{"handle":"qa-18c53fded6ec","password":"****"}

--- response: 200 in 32 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-52b54bcf-b3cf-4386-880e-8b04a63d67ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72750e95-a618-4e47-851e-a8caed59659e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-55ee689c-e146-4289-af32-b503ca9a2e25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55ee689c-e146-4289-af32-b503ca9a2e25
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-55ee689c-e146-4289-af32-b503ca9a2e25
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
correlation: qa-83221565-cc43-486d-b254-517674178125

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83221565-cc43-486d-b254-517674178125
Content-Type: application/json

--- request body ---
{"handle":"qa-18c53fded6ec","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83221565-cc43-486d-b254-517674178125
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-83221565-cc43-486d-b254-517674178125"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-028ca564-e925-453c-be6d-ddf19188b5b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-028ca564-e925-453c-be6d-ddf19188b5b9
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-028ca564-e925-453c-be6d-ddf19188b5b9
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
correlation: qa-a4f96539-c8f4-4d75-8545-c96078740d9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4f96539-c8f4-4d75-8545-c96078740d9b
Content-Type: application/json

--- request body ---
{"handle":"qa-ccf6e4ed6150","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4f96539-c8f4-4d75-8545-c96078740d9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4f96539-c8f4-4d75-8545-c96078740d9b"}
```
