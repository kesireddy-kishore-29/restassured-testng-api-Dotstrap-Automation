# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-85a414b1-3811-4cb0-a90c-387170cf1399` |
| 2 | `POST /v1/accounts` | 201 | 68 | `qa-5e0bc162-5dca-4754-88af-441d8ee6585b` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-4331d46d-bd5f-4854-bb3f-d135d1bdfdf0` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-2fa07c28-0217-4680-ae94-a6dd6fe32a30` |
| 5 | `POST /v1/accounts` | 415 | 13 | `qa-1d529c62-66ba-40d2-96e1-c9b46ebb5cbb` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-02f5f3d1-ef61-4307-93bc-7307ef8a91cd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-3e804869-4eba-4575-8fa0-5cc93b648d76` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-bff2e070-8845-4c97-963c-8a3c4c2adeab` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-6c81bbe3-9335-4139-bd5c-3fb9b2ef023d` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-b9d513bd-3c2d-45cd-99fa-d069f6ef4676` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-85a414b1-3811-4cb0-a90c-387170cf1399

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85a414b1-3811-4cb0-a90c-387170cf1399
Content-Type: application/json

--- request body ---
{"handle":"qa-84756809e44a","displayName":"QA 84756809e44a","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-85a414b1-3811-4cb0-a90c-387170cf1399
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Location: /v1/accounts/qa-84756809e44a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bfe378f7-a16a-474d-a6f4-ff00645fe975","handle":"qa-84756809e44a","displayName":"QA 84756809e44a","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.594246782Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5e0bc162-5dca-4754-88af-441d8ee6585b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e0bc162-5dca-4754-88af-441d8ee6585b
Content-Type: application/json

--- request body ---
{"handle":"qa-7aed9e795d2f","displayName":"QA 7aed9e795d2f","password":"****","region":"eu"}

--- response: 201 in 68 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e0bc162-5dca-4754-88af-441d8ee6585b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Location: /v1/accounts/qa-7aed9e795d2f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_245d8892-c010-4883-823d-d76694ccaa0d","handle":"qa-7aed9e795d2f","displayName":"QA 7aed9e795d2f","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.684888518Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4331d46d-bd5f-4854-bb3f-d135d1bdfdf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4331d46d-bd5f-4854-bb3f-d135d1bdfdf0
Content-Type: application/json

--- request body ---
{"handle":"qa-84756809e44a","password":"****"}

--- response: 200 in 40 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-4331d46d-bd5f-4854-bb3f-d135d1bdfdf0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bfe378f7-a16a-474d-a6f4-ff00645fe975"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2fa07c28-0217-4680-ae94-a6dd6fe32a30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fa07c28-0217-4680-ae94-a6dd6fe32a30
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7aed9e795d2f","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fa07c28-0217-4680-ae94-a6dd6fe32a30
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
Location: /v1/conversations/cnv_3603ce7f-8135-4b79-bd43-806e4ba99a5c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3603ce7f-8135-4b79-bd43-806e4ba99a5c","subject":"Error contract","status":"open","region":"eu","participants":["qa-84756809e44a","qa-7aed9e795d2f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:25.780153045Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-1d529c62-66ba-40d2-96e1-c9b46ebb5cbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d529c62-66ba-40d2-96e1-c9b46ebb5cbb
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d529c62-66ba-40d2-96e1-c9b46ebb5cbb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-1d529c62-66ba-40d2-96e1-c9b46ebb5cbb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-02f5f3d1-ef61-4307-93bc-7307ef8a91cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02f5f3d1-ef61-4307-93bc-7307ef8a91cd
Content-Type: application/json

--- request body ---
{"handle":"qa-7aed9e795d2f","password":"****"}

--- response: 200 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-02f5f3d1-ef61-4307-93bc-7307ef8a91cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_245d8892-c010-4883-823d-d76694ccaa0d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3e804869-4eba-4575-8fa0-5cc93b648d76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e804869-4eba-4575-8fa0-5cc93b648d76
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3e804869-4eba-4575-8fa0-5cc93b648d76
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
correlation: qa-bff2e070-8845-4c97-963c-8a3c4c2adeab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bff2e070-8845-4c97-963c-8a3c4c2adeab
Content-Type: application/json

--- request body ---
{"handle":"qa-7aed9e795d2f","password":"****"}

--- response: 401 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bff2e070-8845-4c97-963c-8a3c4c2adeab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bff2e070-8845-4c97-963c-8a3c4c2adeab"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c81bbe3-9335-4139-bd5c-3fb9b2ef023d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c81bbe3-9335-4139-bd5c-3fb9b2ef023d
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c81bbe3-9335-4139-bd5c-3fb9b2ef023d
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
correlation: qa-b9d513bd-3c2d-45cd-99fa-d069f6ef4676

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9d513bd-3c2d-45cd-99fa-d069f6ef4676
Content-Type: application/json

--- request body ---
{"handle":"qa-84756809e44a","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9d513bd-3c2d-45cd-99fa-d069f6ef4676
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b9d513bd-3c2d-45cd-99fa-d069f6ef4676"}
```
