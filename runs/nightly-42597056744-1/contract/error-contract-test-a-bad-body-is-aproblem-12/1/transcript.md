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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-62573b79-8477-447a-b9b3-8c0fc9a49b0e` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-45d743f6-c390-4a9a-9d83-144a09bdd9bf` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-888497ef-7b04-457f-ac96-434388150095` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-f28806eb-39ec-4c13-a0a6-65d81fff969a` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 15 | `qa-b366ba23-ed2a-4f6e-aec5-c4dd7987c0df` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-b489d145-cf90-47fb-a71f-45dee928096d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-64da6ede-4395-4789-a676-88772cfa2b1f` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-6f8b876f-dd6e-444c-bab2-a19917c4b7e5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-4a650cbc-74c6-4732-9480-a78f95430011` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-fda62496-0dad-4772-bb28-e6bb6a4ae2ea` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-62573b79-8477-447a-b9b3-8c0fc9a49b0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62573b79-8477-447a-b9b3-8c0fc9a49b0e
Content-Type: application/json

--- request body ---
{"handle":"qa-acfcbded8309","displayName":"QA acfcbded8309","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-62573b79-8477-447a-b9b3-8c0fc9a49b0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 8
Location: /v1/accounts/qa-acfcbded8309
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cdf85194-9ae9-4de8-a59a-fd9d0f89ea5e","handle":"qa-acfcbded8309","displayName":"QA acfcbded8309","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.526601406Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-45d743f6-c390-4a9a-9d83-144a09bdd9bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45d743f6-c390-4a9a-9d83-144a09bdd9bf
Content-Type: application/json

--- request body ---
{"handle":"qa-dd76a621d960","displayName":"QA dd76a621d960","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-45d743f6-c390-4a9a-9d83-144a09bdd9bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 8
Location: /v1/accounts/qa-dd76a621d960
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f4bbc7f-2ed0-4ab9-85d4-defac51567a4","handle":"qa-dd76a621d960","displayName":"QA dd76a621d960","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.543858266Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-888497ef-7b04-457f-ac96-434388150095

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-888497ef-7b04-457f-ac96-434388150095
Content-Type: application/json

--- request body ---
{"handle":"qa-acfcbded8309","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-888497ef-7b04-457f-ac96-434388150095
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cdf85194-9ae9-4de8-a59a-fd9d0f89ea5e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f28806eb-39ec-4c13-a0a6-65d81fff969a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f28806eb-39ec-4c13-a0a6-65d81fff969a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dd76a621d960","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f28806eb-39ec-4c13-a0a6-65d81fff969a
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
Location: /v1/conversations/cnv_84bb9ed4-f56d-49cd-8db7-5fd507f685b5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_84bb9ed4-f56d-49cd-8db7-5fd507f685b5","subject":"Error contract","status":"open","region":"eu","participants":["qa-acfcbded8309","qa-dd76a621d960"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.599203290Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_84bb9ed4-f56d-49cd-8db7-5fd507f685b5/messages
correlation: qa-b366ba23-ed2a-4f6e-aec5-c4dd7987c0df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b366ba23-ed2a-4f6e-aec5-c4dd7987c0df
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b366ba23-ed2a-4f6e-aec5-c4dd7987c0df
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_84bb9ed4-f56d-49cd-8db7-5fd507f685b5/messages","correlationId":"qa-b366ba23-ed2a-4f6e-aec5-c4dd7987c0df"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b489d145-cf90-47fb-a71f-45dee928096d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b489d145-cf90-47fb-a71f-45dee928096d
Content-Type: application/json

--- request body ---
{"handle":"qa-dd76a621d960","password":"****"}

--- response: 200 in 37 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b489d145-cf90-47fb-a71f-45dee928096d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3f4bbc7f-2ed0-4ab9-85d4-defac51567a4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-64da6ede-4395-4789-a676-88772cfa2b1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64da6ede-4395-4789-a676-88772cfa2b1f
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-64da6ede-4395-4789-a676-88772cfa2b1f
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
correlation: qa-6f8b876f-dd6e-444c-bab2-a19917c4b7e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f8b876f-dd6e-444c-bab2-a19917c4b7e5
Content-Type: application/json

--- request body ---
{"handle":"qa-dd76a621d960","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f8b876f-dd6e-444c-bab2-a19917c4b7e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6f8b876f-dd6e-444c-bab2-a19917c4b7e5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4a650cbc-74c6-4732-9480-a78f95430011

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a650cbc-74c6-4732-9480-a78f95430011
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4a650cbc-74c6-4732-9480-a78f95430011
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
correlation: qa-fda62496-0dad-4772-bb28-e6bb6a4ae2ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fda62496-0dad-4772-bb28-e6bb6a4ae2ea
Content-Type: application/json

--- request body ---
{"handle":"qa-acfcbded8309","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fda62496-0dad-4772-bb28-e6bb6a4ae2ea
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fda62496-0dad-4772-bb28-e6bb6a4ae2ea"}
```
