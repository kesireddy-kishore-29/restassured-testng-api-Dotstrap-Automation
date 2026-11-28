# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-adf20c9f-bc04-4d38-8f18-5363e594048e` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-9c828cc8-daa7-4515-9326-e756c39c9051` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-88427f65-46a0-4b9f-ac1f-fce61d4fcbb1` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-e231fe72-9e1e-4ab5-a8bf-27a9af1627ad` |
| 5 | `GET /v1/accounts/me` | 503 | 10 | `qa-860ad843-df82-46b5-8110-ebaa7c0ca00a` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-e02b1ec2-a6fe-43d1-91cd-486ea3f09857` |
| 7 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-4bf0bbd1-fe64-41cb-95cc-4cf296e7257f` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-ed44d1d3-4d91-4fca-a455-04c1e9ecff46` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-c9e081e5-c84d-4845-9350-54394fc3e7a4` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-e5e9b26a-5959-4a2c-8f2a-35840c64447e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-adf20c9f-bc04-4d38-8f18-5363e594048e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adf20c9f-bc04-4d38-8f18-5363e594048e
Content-Type: application/json

--- request body ---
{"handle":"qa-1aa5ecf9c2cf","displayName":"QA 1aa5ecf9c2cf","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-adf20c9f-bc04-4d38-8f18-5363e594048e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-1aa5ecf9c2cf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_63d4ca6d-6d75-44df-9012-3ce1f52ffe84","handle":"qa-1aa5ecf9c2cf","displayName":"QA 1aa5ecf9c2cf","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.191953689Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9c828cc8-daa7-4515-9326-e756c39c9051

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c828cc8-daa7-4515-9326-e756c39c9051
Content-Type: application/json

--- request body ---
{"handle":"qa-12e4e4327943","displayName":"QA 12e4e4327943","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c828cc8-daa7-4515-9326-e756c39c9051
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Location: /v1/accounts/qa-12e4e4327943
X-Served-Region: eu
Content-Length: 181

{"id":"acc_68d6057c-1ae7-40db-a036-bf8760838246","handle":"qa-12e4e4327943","displayName":"QA 12e4e4327943","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.234995029Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-88427f65-46a0-4b9f-ac1f-fce61d4fcbb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88427f65-46a0-4b9f-ac1f-fce61d4fcbb1
Content-Type: application/json

--- request body ---
{"handle":"qa-1aa5ecf9c2cf","password":"****"}

--- response: 200 in 30 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-88427f65-46a0-4b9f-ac1f-fce61d4fcbb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_63d4ca6d-6d75-44df-9012-3ce1f52ffe84"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e231fe72-9e1e-4ab5-a8bf-27a9af1627ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e231fe72-9e1e-4ab5-a8bf-27a9af1627ad
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-12e4e4327943","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e231fe72-9e1e-4ab5-a8bf-27a9af1627ad
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
Location: /v1/conversations/cnv_498250ad-5c91-4890-9a21-2171b227fa72
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_498250ad-5c91-4890-9a21-2171b227fa72","subject":"Error contract","status":"open","region":"eu","participants":["qa-1aa5ecf9c2cf","qa-12e4e4327943"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.314216214Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-860ad843-df82-46b5-8110-ebaa7c0ca00a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 4e9353a1-5914-419c-bbfe-5e20abd27bba
X-Correlation-Id: qa-860ad843-df82-46b5-8110-ebaa7c0ca00a
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-860ad843-df82-46b5-8110-ebaa7c0ca00a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-860ad843-df82-46b5-8110-ebaa7c0ca00a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e02b1ec2-a6fe-43d1-91cd-486ea3f09857

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e02b1ec2-a6fe-43d1-91cd-486ea3f09857
Content-Type: application/json

--- request body ---
{"handle":"qa-12e4e4327943","password":"****"}

--- response: 200 in 33 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e02b1ec2-a6fe-43d1-91cd-486ea3f09857
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68d6057c-1ae7-40db-a036-bf8760838246"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4bf0bbd1-fe64-41cb-95cc-4cf296e7257f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bf0bbd1-fe64-41cb-95cc-4cf296e7257f
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4bf0bbd1-fe64-41cb-95cc-4cf296e7257f
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
correlation: qa-ed44d1d3-4d91-4fca-a455-04c1e9ecff46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed44d1d3-4d91-4fca-a455-04c1e9ecff46
Content-Type: application/json

--- request body ---
{"handle":"qa-12e4e4327943","password":"****"}

--- response: 401 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed44d1d3-4d91-4fca-a455-04c1e9ecff46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ed44d1d3-4d91-4fca-a455-04c1e9ecff46"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c9e081e5-c84d-4845-9350-54394fc3e7a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9e081e5-c84d-4845-9350-54394fc3e7a4
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c9e081e5-c84d-4845-9350-54394fc3e7a4
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
correlation: qa-e5e9b26a-5959-4a2c-8f2a-35840c64447e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5e9b26a-5959-4a2c-8f2a-35840c64447e
Content-Type: application/json

--- request body ---
{"handle":"qa-1aa5ecf9c2cf","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5e9b26a-5959-4a2c-8f2a-35840c64447e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e5e9b26a-5959-4a2c-8f2a-35840c64447e"}
```
