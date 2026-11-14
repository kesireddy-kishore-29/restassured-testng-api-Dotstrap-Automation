# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 67 | `qa-425e6a3b-b62a-4f0c-a561-523b073922c0` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-bf5b54b5-2a75-4b2d-8e00-5c645fb6dd73` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-c456745f-159d-43f7-b57f-ce4691c2ab8c` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-33b31a91-a8a9-4252-af29-0c38a506a24a` |
| 5 | `POST /v1/accounts` | 503 | 21 | `qa-db8217d8-c37a-4574-aa5b-404f2cabfea8` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-ec04e359-ac07-46b1-97ea-cca77ee054cc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-fa625bad-49ec-4497-8e85-4e740e0dba7b` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-281b0f1c-b15c-4437-a3aa-aa95f7a26330` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-b25a7919-702e-42b7-a941-a246a243898b` |
| 10 | `POST /v1/auth/token` | 401 | 32 | `qa-92cd4c0b-5e5b-4ff9-a636-8136f29ff459` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-425e6a3b-b62a-4f0c-a561-523b073922c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-425e6a3b-b62a-4f0c-a561-523b073922c0
Content-Type: application/json

--- request body ---
{"handle":"qa-96da70c7ee0e","displayName":"QA 96da70c7ee0e","password":"****","region":"eu"}

--- response: 201 in 67 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-425e6a3b-b62a-4f0c-a561-523b073922c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Location: /v1/accounts/qa-96da70c7ee0e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e0bd0d77-80cb-4ec1-af26-65030fdfb355","handle":"qa-96da70c7ee0e","displayName":"QA 96da70c7ee0e","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.151184104Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bf5b54b5-2a75-4b2d-8e00-5c645fb6dd73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf5b54b5-2a75-4b2d-8e00-5c645fb6dd73
Content-Type: application/json

--- request body ---
{"handle":"qa-773570f2e54b","displayName":"QA 773570f2e54b","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf5b54b5-2a75-4b2d-8e00-5c645fb6dd73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Location: /v1/accounts/qa-773570f2e54b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_38493890-68d7-4d7d-8f36-e6304d1cd29d","handle":"qa-773570f2e54b","displayName":"QA 773570f2e54b","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.202205285Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c456745f-159d-43f7-b57f-ce4691c2ab8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c456745f-159d-43f7-b57f-ce4691c2ab8c
Content-Type: application/json

--- request body ---
{"handle":"qa-96da70c7ee0e","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c456745f-159d-43f7-b57f-ce4691c2ab8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0bd0d77-80cb-4ec1-af26-65030fdfb355"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-33b31a91-a8a9-4252-af29-0c38a506a24a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33b31a91-a8a9-4252-af29-0c38a506a24a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-773570f2e54b","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-33b31a91-a8a9-4252-af29-0c38a506a24a
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
Location: /v1/conversations/cnv_67a93d6e-ce75-481c-a720-4007627e62d1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_67a93d6e-ce75-481c-a720-4007627e62d1","subject":"Error contract","status":"open","region":"eu","participants":["qa-96da70c7ee0e","qa-773570f2e54b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:35.284943792Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-db8217d8-c37a-4574-aa5b-404f2cabfea8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 55b29952-1ec7-454f-a0b3-9b83a4997b65
X-Correlation-Id: qa-db8217d8-c37a-4574-aa5b-404f2cabfea8
Content-Type: application/json

--- request body ---
{"handle":"qa-c74e639268e7","displayName":"QA c74e639268e7","password":"****","region":"eu"}

--- response: 503 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db8217d8-c37a-4574-aa5b-404f2cabfea8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-db8217d8-c37a-4574-aa5b-404f2cabfea8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ec04e359-ac07-46b1-97ea-cca77ee054cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec04e359-ac07-46b1-97ea-cca77ee054cc
Content-Type: application/json

--- request body ---
{"handle":"qa-773570f2e54b","password":"****"}

--- response: 200 in 40 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec04e359-ac07-46b1-97ea-cca77ee054cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_38493890-68d7-4d7d-8f36-e6304d1cd29d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa625bad-49ec-4497-8e85-4e740e0dba7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa625bad-49ec-4497-8e85-4e740e0dba7b
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa625bad-49ec-4497-8e85-4e740e0dba7b
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
correlation: qa-281b0f1c-b15c-4437-a3aa-aa95f7a26330

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-281b0f1c-b15c-4437-a3aa-aa95f7a26330
Content-Type: application/json

--- request body ---
{"handle":"qa-773570f2e54b","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-281b0f1c-b15c-4437-a3aa-aa95f7a26330
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-281b0f1c-b15c-4437-a3aa-aa95f7a26330"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b25a7919-702e-42b7-a941-a246a243898b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b25a7919-702e-42b7-a941-a246a243898b
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b25a7919-702e-42b7-a941-a246a243898b
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
correlation: qa-92cd4c0b-5e5b-4ff9-a636-8136f29ff459

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92cd4c0b-5e5b-4ff9-a636-8136f29ff459
Content-Type: application/json

--- request body ---
{"handle":"qa-96da70c7ee0e","password":"****"}

--- response: 401 in 32 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92cd4c0b-5e5b-4ff9-a636-8136f29ff459
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-92cd4c0b-5e5b-4ff9-a636-8136f29ff459"}
```
