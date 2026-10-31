# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-0802ef5d-b10e-4ca1-a09f-f48f49912c06` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-e3f87941-1531-494b-915e-427d293e076c` |
| 3 | `POST /v1/auth/token` | 200 | 67 | `qa-76efe723-a31a-4b51-a6be-aba94ff0e9b4` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-bf7a6f00-cb8b-417f-8143-40ec235f1113` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 8 | `qa-59b8cdcd-b871-4603-bade-9608e5fac035` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-85ad1bc2-1728-4c81-abfb-9ad1509f480e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-21ac7502-bd49-427d-9572-36c0edac5b66` |
| 8 | `POST /v1/auth/token` | 401 | 3 | `qa-c7a18873-dfba-4eec-9b18-b8fedc7c048f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-1cb8e1cf-0bcb-40b1-bf9a-545f6dfb3330` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-a6733fd5-e74f-49d6-aeab-c8cbec13ed39` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0802ef5d-b10e-4ca1-a09f-f48f49912c06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0802ef5d-b10e-4ca1-a09f-f48f49912c06
Content-Type: application/json

--- request body ---
{"handle":"qa-7587946f0a99","displayName":"QA 7587946f0a99","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0802ef5d-b10e-4ca1-a09f-f48f49912c06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 8
Location: /v1/accounts/qa-7587946f0a99
X-Served-Region: eu
Content-Length: 181

{"id":"acc_34ccd52f-f66c-413c-93d8-e491ed29864d","handle":"qa-7587946f0a99","displayName":"QA 7587946f0a99","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.631598885Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e3f87941-1531-494b-915e-427d293e076c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3f87941-1531-494b-915e-427d293e076c
Content-Type: application/json

--- request body ---
{"handle":"qa-30ce39abdcf2","displayName":"QA 30ce39abdcf2","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3f87941-1531-494b-915e-427d293e076c
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
Location: /v1/accounts/qa-30ce39abdcf2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a6f7d8ff-9873-430c-a4ce-8ca985f6d99b","handle":"qa-30ce39abdcf2","displayName":"QA 30ce39abdcf2","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.674017177Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-76efe723-a31a-4b51-a6be-aba94ff0e9b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76efe723-a31a-4b51-a6be-aba94ff0e9b4
Content-Type: application/json

--- request body ---
{"handle":"qa-7587946f0a99","password":"****"}

--- response: 200 in 67 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-76efe723-a31a-4b51-a6be-aba94ff0e9b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_34ccd52f-f66c-413c-93d8-e491ed29864d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bf7a6f00-cb8b-417f-8143-40ec235f1113

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf7a6f00-cb8b-417f-8143-40ec235f1113
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-30ce39abdcf2","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf7a6f00-cb8b-417f-8143-40ec235f1113
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
Location: /v1/conversations/cnv_ebe27893-7e13-4581-aae9-e068a4997526
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ebe27893-7e13-4581-aae9-e068a4997526","subject":"Error contract","status":"open","region":"eu","participants":["qa-7587946f0a99","qa-30ce39abdcf2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.783689269Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ebe27893-7e13-4581-aae9-e068a4997526/messages
correlation: qa-59b8cdcd-b871-4603-bade-9608e5fac035

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59b8cdcd-b871-4603-bade-9608e5fac035
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59b8cdcd-b871-4603-bade-9608e5fac035
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_ebe27893-7e13-4581-aae9-e068a4997526/messages","correlationId":"qa-59b8cdcd-b871-4603-bade-9608e5fac035"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-85ad1bc2-1728-4c81-abfb-9ad1509f480e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85ad1bc2-1728-4c81-abfb-9ad1509f480e
Content-Type: application/json

--- request body ---
{"handle":"qa-30ce39abdcf2","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-85ad1bc2-1728-4c81-abfb-9ad1509f480e
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a6f7d8ff-9873-430c-a4ce-8ca985f6d99b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21ac7502-bd49-427d-9572-36c0edac5b66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21ac7502-bd49-427d-9572-36c0edac5b66
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21ac7502-bd49-427d-9572-36c0edac5b66
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
correlation: qa-c7a18873-dfba-4eec-9b18-b8fedc7c048f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7a18873-dfba-4eec-9b18-b8fedc7c048f
Content-Type: application/json

--- request body ---
{"handle":"qa-30ce39abdcf2","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7a18873-dfba-4eec-9b18-b8fedc7c048f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c7a18873-dfba-4eec-9b18-b8fedc7c048f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1cb8e1cf-0bcb-40b1-bf9a-545f6dfb3330

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cb8e1cf-0bcb-40b1-bf9a-545f6dfb3330
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1cb8e1cf-0bcb-40b1-bf9a-545f6dfb3330
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
correlation: qa-a6733fd5-e74f-49d6-aeab-c8cbec13ed39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6733fd5-e74f-49d6-aeab-c8cbec13ed39
Content-Type: application/json

--- request body ---
{"handle":"qa-7587946f0a99","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6733fd5-e74f-49d6-aeab-c8cbec13ed39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a6733fd5-e74f-49d6-aeab-c8cbec13ed39"}
```
