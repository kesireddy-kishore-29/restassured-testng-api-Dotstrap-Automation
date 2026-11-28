# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 59 | `qa-3123df8d-0f0b-4083-a972-d9be8577721c` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-4706cf8e-14ec-46d5-aab7-502c4b3470a2` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-3d4f2200-ca3f-482a-9dbf-87c0867b1954` |
| 4 | `POST /v1/conversations` | 201 | 34 | `qa-9747c2cf-de5a-48bd-8365-e294467d0352` |
| 5 | `POST /v1/auth/token` | 415 | 41 | `qa-2425650b-4177-4cf5-9388-be7071ceda3e` |
| 6 | `POST /v1/auth/token` | 200 | 61 | `qa-63ee8f88-fd48-4136-823b-001d303f1dbb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-08426c12-37b7-42b8-bb01-7c24959d5599` |
| 8 | `POST /v1/auth/token` | 401 | 53 | `qa-ba9ce514-7427-4eb8-92b3-3be3fb26e12d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-a6f68896-77a0-416e-abbe-b4b8443a1e3e` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-da95865a-3fb6-4eef-b99c-45aa4f4607ac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3123df8d-0f0b-4083-a972-d9be8577721c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3123df8d-0f0b-4083-a972-d9be8577721c
Content-Type: application/json

--- request body ---
{"handle":"qa-aff2c751e2b5","displayName":"QA aff2c751e2b5","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-3123df8d-0f0b-4083-a972-d9be8577721c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Location: /v1/accounts/qa-aff2c751e2b5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ae45bae3-5912-493a-a6b7-85cb04470b35","handle":"qa-aff2c751e2b5","displayName":"QA aff2c751e2b5","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.159205099Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4706cf8e-14ec-46d5-aab7-502c4b3470a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4706cf8e-14ec-46d5-aab7-502c4b3470a2
Content-Type: application/json

--- request body ---
{"handle":"qa-4e8e0d76355b","displayName":"QA 4e8e0d76355b","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-4706cf8e-14ec-46d5-aab7-502c4b3470a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Location: /v1/accounts/qa-4e8e0d76355b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_294f34cb-f8fb-4e79-abf4-306724410ffd","handle":"qa-4e8e0d76355b","displayName":"QA 4e8e0d76355b","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.223894094Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3d4f2200-ca3f-482a-9dbf-87c0867b1954

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d4f2200-ca3f-482a-9dbf-87c0867b1954
Content-Type: application/json

--- request body ---
{"handle":"qa-aff2c751e2b5","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d4f2200-ca3f-482a-9dbf-87c0867b1954
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ae45bae3-5912-493a-a6b7-85cb04470b35"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9747c2cf-de5a-48bd-8365-e294467d0352

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9747c2cf-de5a-48bd-8365-e294467d0352
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4e8e0d76355b","subject":"Error contract","message":"Hi"}

--- response: 201 in 34 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-9747c2cf-de5a-48bd-8365-e294467d0352
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
Location: /v1/conversations/cnv_9d0b4448-743a-40ac-b5da-647ff4d06508
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9d0b4448-743a-40ac-b5da-647ff4d06508","subject":"Error contract","status":"open","region":"eu","participants":["qa-aff2c751e2b5","qa-4e8e0d76355b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:13.316903569Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2425650b-4177-4cf5-9388-be7071ceda3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2425650b-4177-4cf5-9388-be7071ceda3e
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 41 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2425650b-4177-4cf5-9388-be7071ceda3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-2425650b-4177-4cf5-9388-be7071ceda3e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-63ee8f88-fd48-4136-823b-001d303f1dbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63ee8f88-fd48-4136-823b-001d303f1dbb
Content-Type: application/json

--- request body ---
{"handle":"qa-4e8e0d76355b","password":"****"}

--- response: 200 in 61 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-63ee8f88-fd48-4136-823b-001d303f1dbb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_294f34cb-f8fb-4e79-abf4-306724410ffd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-08426c12-37b7-42b8-bb01-7c24959d5599

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08426c12-37b7-42b8-bb01-7c24959d5599
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-08426c12-37b7-42b8-bb01-7c24959d5599
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
correlation: qa-ba9ce514-7427-4eb8-92b3-3be3fb26e12d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba9ce514-7427-4eb8-92b3-3be3fb26e12d
Content-Type: application/json

--- request body ---
{"handle":"qa-4e8e0d76355b","password":"****"}

--- response: 401 in 53 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba9ce514-7427-4eb8-92b3-3be3fb26e12d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ba9ce514-7427-4eb8-92b3-3be3fb26e12d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a6f68896-77a0-416e-abbe-b4b8443a1e3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6f68896-77a0-416e-abbe-b4b8443a1e3e
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a6f68896-77a0-416e-abbe-b4b8443a1e3e
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
correlation: qa-da95865a-3fb6-4eef-b99c-45aa4f4607ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da95865a-3fb6-4eef-b99c-45aa4f4607ac
Content-Type: application/json

--- request body ---
{"handle":"qa-aff2c751e2b5","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da95865a-3fb6-4eef-b99c-45aa4f4607ac
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-da95865a-3fb6-4eef-b99c-45aa4f4607ac"}
```
