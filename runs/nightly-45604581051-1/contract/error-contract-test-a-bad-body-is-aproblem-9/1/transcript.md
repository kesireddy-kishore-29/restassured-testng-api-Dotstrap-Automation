# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-980d980d-781c-498f-85be-8cc6f00f195f` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-d6087cf3-b537-4f4d-b53f-6fd3e4116760` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-08dea726-f6bf-45a6-91f2-4fc154f4a161` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-cfd12bd0-c725-44a0-986d-a5b8157f9073` |
| 5 | `POST /v1/conversations` | 400 | 10 | `qa-3e948d6c-0769-4e15-adf1-ac430981b58e` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-44a18a69-c2c7-410f-8922-c967ee1824c8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-a455a325-fdba-499b-b010-dc575fbc1396` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-040eb3a3-d0b3-418d-85c5-68234d3b8a5d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-aac894a1-ec5c-45a4-83ba-0385e9216f55` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-96e17475-e921-4423-a501-2e9c8645c7d7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-980d980d-781c-498f-85be-8cc6f00f195f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-980d980d-781c-498f-85be-8cc6f00f195f
Content-Type: application/json

--- request body ---
{"handle":"qa-9f7ff7decae3","displayName":"QA 9f7ff7decae3","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-980d980d-781c-498f-85be-8cc6f00f195f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Location: /v1/accounts/qa-9f7ff7decae3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6171de48-ce34-485a-b9ac-4c1e1b18d070","handle":"qa-9f7ff7decae3","displayName":"QA 9f7ff7decae3","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.886638044Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d6087cf3-b537-4f4d-b53f-6fd3e4116760

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6087cf3-b537-4f4d-b53f-6fd3e4116760
Content-Type: application/json

--- request body ---
{"handle":"qa-00a34feb6a9b","displayName":"QA 00a34feb6a9b","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6087cf3-b537-4f4d-b53f-6fd3e4116760
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Location: /v1/accounts/qa-00a34feb6a9b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_82762274-2aa9-4950-bf95-cad3a7bd5eb9","handle":"qa-00a34feb6a9b","displayName":"QA 00a34feb6a9b","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.922817664Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-08dea726-f6bf-45a6-91f2-4fc154f4a161

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08dea726-f6bf-45a6-91f2-4fc154f4a161
Content-Type: application/json

--- request body ---
{"handle":"qa-9f7ff7decae3","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-08dea726-f6bf-45a6-91f2-4fc154f4a161
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6171de48-ce34-485a-b9ac-4c1e1b18d070"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cfd12bd0-c725-44a0-986d-a5b8157f9073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfd12bd0-c725-44a0-986d-a5b8157f9073
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-00a34feb6a9b","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfd12bd0-c725-44a0-986d-a5b8157f9073
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
Location: /v1/conversations/cnv_efad165d-1ffb-4361-88e9-fca16fb3f051
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_efad165d-1ffb-4361-88e9-fca16fb3f051","subject":"Error contract","status":"open","region":"eu","participants":["qa-9f7ff7decae3","qa-00a34feb6a9b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:58.984392912Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-3e948d6c-0769-4e15-adf1-ac430981b58e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e948d6c-0769-4e15-adf1-ac430981b58e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e948d6c-0769-4e15-adf1-ac430981b58e
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-3e948d6c-0769-4e15-adf1-ac430981b58e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-44a18a69-c2c7-410f-8922-c967ee1824c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44a18a69-c2c7-410f-8922-c967ee1824c8
Content-Type: application/json

--- request body ---
{"handle":"qa-00a34feb6a9b","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-44a18a69-c2c7-410f-8922-c967ee1824c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_82762274-2aa9-4950-bf95-cad3a7bd5eb9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a455a325-fdba-499b-b010-dc575fbc1396

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a455a325-fdba-499b-b010-dc575fbc1396
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a455a325-fdba-499b-b010-dc575fbc1396
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
correlation: qa-040eb3a3-d0b3-418d-85c5-68234d3b8a5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-040eb3a3-d0b3-418d-85c5-68234d3b8a5d
Content-Type: application/json

--- request body ---
{"handle":"qa-00a34feb6a9b","password":"****"}

--- response: 401 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-040eb3a3-d0b3-418d-85c5-68234d3b8a5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-040eb3a3-d0b3-418d-85c5-68234d3b8a5d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aac894a1-ec5c-45a4-83ba-0385e9216f55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aac894a1-ec5c-45a4-83ba-0385e9216f55
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aac894a1-ec5c-45a4-83ba-0385e9216f55
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
correlation: qa-96e17475-e921-4423-a501-2e9c8645c7d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96e17475-e921-4423-a501-2e9c8645c7d7
Content-Type: application/json

--- request body ---
{"handle":"qa-9f7ff7decae3","password":"****"}

--- response: 401 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96e17475-e921-4423-a501-2e9c8645c7d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-96e17475-e921-4423-a501-2e9c8645c7d7"}
```
