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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-5299ce72-7b50-4a26-b51a-825e7752909f` |
| 2 | `POST /v1/accounts` | 201 | 49 | `qa-ca385c34-835b-47db-9538-acc9184f533f` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-f18eefa1-10aa-4c77-9dd7-69e9019eabb9` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-9aa5593a-8245-4e43-80ce-70f194ddaa80` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 11 | `qa-eb9b1b80-a4be-4ff1-a9fe-52534f3dd21e` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-f0316377-8382-41c1-ba24-47edc59f0105` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-5e0f0ecb-7421-4997-af03-692dd40eaeff` |
| 8 | `POST /v1/auth/token` | 401 | 4 | `qa-ad22ba73-9e37-4b9e-aa0f-523e88901a3b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-e9ca050d-e8c6-473c-be4d-57374f39ca42` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-22045278-9b18-444b-924c-f076df405273` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5299ce72-7b50-4a26-b51a-825e7752909f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5299ce72-7b50-4a26-b51a-825e7752909f
Content-Type: application/json

--- request body ---
{"handle":"qa-3d1218a15c90","displayName":"QA 3d1218a15c90","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5299ce72-7b50-4a26-b51a-825e7752909f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 7
Location: /v1/accounts/qa-3d1218a15c90
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dab7c0de-69b3-471a-ab85-a469d591d5cc","handle":"qa-3d1218a15c90","displayName":"QA 3d1218a15c90","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.645916743Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ca385c34-835b-47db-9538-acc9184f533f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca385c34-835b-47db-9538-acc9184f533f
Content-Type: application/json

--- request body ---
{"handle":"qa-d1818bbac608","displayName":"QA d1818bbac608","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca385c34-835b-47db-9538-acc9184f533f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 7
Location: /v1/accounts/qa-d1818bbac608
X-Served-Region: eu
Content-Length: 181

{"id":"acc_10f0900d-2104-4771-86f7-80ebb3f8860a","handle":"qa-d1818bbac608","displayName":"QA d1818bbac608","region":"eu","role":"user","createdAt":"2026-11-27T10:59:59.717347904Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f18eefa1-10aa-4c77-9dd7-69e9019eabb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f18eefa1-10aa-4c77-9dd7-69e9019eabb9
Content-Type: application/json

--- request body ---
{"handle":"qa-3d1218a15c90","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f18eefa1-10aa-4c77-9dd7-69e9019eabb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dab7c0de-69b3-471a-ab85-a469d591d5cc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9aa5593a-8245-4e43-80ce-70f194ddaa80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9aa5593a-8245-4e43-80ce-70f194ddaa80
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d1818bbac608","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9aa5593a-8245-4e43-80ce-70f194ddaa80
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
Location: /v1/conversations/cnv_19f4052b-b55c-4e07-a722-cc8bcdf770d6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_19f4052b-b55c-4e07-a722-cc8bcdf770d6","subject":"Error contract","status":"open","region":"eu","participants":["qa-3d1218a15c90","qa-d1818bbac608"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:59.785743112Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_19f4052b-b55c-4e07-a722-cc8bcdf770d6/messages
correlation: qa-eb9b1b80-a4be-4ff1-a9fe-52534f3dd21e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb9b1b80-a4be-4ff1-a9fe-52534f3dd21e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb9b1b80-a4be-4ff1-a9fe-52534f3dd21e
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_19f4052b-b55c-4e07-a722-cc8bcdf770d6/messages","correlationId":"qa-eb9b1b80-a4be-4ff1-a9fe-52534f3dd21e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f0316377-8382-41c1-ba24-47edc59f0105

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0316377-8382-41c1-ba24-47edc59f0105
Content-Type: application/json

--- request body ---
{"handle":"qa-d1818bbac608","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0316377-8382-41c1-ba24-47edc59f0105
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_10f0900d-2104-4771-86f7-80ebb3f8860a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e0f0ecb-7421-4997-af03-692dd40eaeff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e0f0ecb-7421-4997-af03-692dd40eaeff
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e0f0ecb-7421-4997-af03-692dd40eaeff
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
correlation: qa-ad22ba73-9e37-4b9e-aa0f-523e88901a3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad22ba73-9e37-4b9e-aa0f-523e88901a3b
Content-Type: application/json

--- request body ---
{"handle":"qa-d1818bbac608","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad22ba73-9e37-4b9e-aa0f-523e88901a3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad22ba73-9e37-4b9e-aa0f-523e88901a3b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e9ca050d-e8c6-473c-be4d-57374f39ca42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9ca050d-e8c6-473c-be4d-57374f39ca42
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e9ca050d-e8c6-473c-be4d-57374f39ca42
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
correlation: qa-22045278-9b18-444b-924c-f076df405273

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22045278-9b18-444b-924c-f076df405273
Content-Type: application/json

--- request body ---
{"handle":"qa-3d1218a15c90","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22045278-9b18-444b-924c-f076df405273
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22045278-9b18-444b-924c-f076df405273"}
```
