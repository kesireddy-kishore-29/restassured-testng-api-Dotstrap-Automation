# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-ab71b59a-6799-4710-baa0-b8cea3a2aab0` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-f241473b-edc2-4357-9b38-32cc27d14482` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-c1defcaf-9b57-413b-a5fe-d4059e7cf392` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-1ae7ec05-410f-41ad-b2bc-19b534e49892` |
| 5 | `POST /v1/credits/purchases` | 415 | 5 | `qa-4be8efa3-88c8-4509-93d7-6b2d9b632900` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-4f861e1f-fed6-451c-b4e0-d012dcd88e3d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-88956649-f960-4ec5-b45a-3843835c1ff5` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-2dfbc7f2-68ee-40e3-abee-1b175a2acf37` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-058bc8ee-b306-491e-9dfa-d8972f692bf0` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-7453acd5-a1eb-4f13-b08c-1b73319fba19` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ab71b59a-6799-4710-baa0-b8cea3a2aab0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab71b59a-6799-4710-baa0-b8cea3a2aab0
Content-Type: application/json

--- request body ---
{"handle":"qa-0625156bea35","displayName":"QA 0625156bea35","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab71b59a-6799-4710-baa0-b8cea3a2aab0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 6
Location: /v1/accounts/qa-0625156bea35
X-Served-Region: eu
Content-Length: 181

{"id":"acc_17d3dc0c-6fc9-4484-99a5-c03a92da8f9e","handle":"qa-0625156bea35","displayName":"QA 0625156bea35","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.817203639Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f241473b-edc2-4357-9b38-32cc27d14482

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f241473b-edc2-4357-9b38-32cc27d14482
Content-Type: application/json

--- request body ---
{"handle":"qa-33e89a804758","displayName":"QA 33e89a804758","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f241473b-edc2-4357-9b38-32cc27d14482
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 6
Location: /v1/accounts/qa-33e89a804758
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3e564ad7-9a68-43d1-ac65-1d2e04c49ee3","handle":"qa-33e89a804758","displayName":"QA 33e89a804758","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.870175469Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c1defcaf-9b57-413b-a5fe-d4059e7cf392

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1defcaf-9b57-413b-a5fe-d4059e7cf392
Content-Type: application/json

--- request body ---
{"handle":"qa-0625156bea35","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1defcaf-9b57-413b-a5fe-d4059e7cf392
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_17d3dc0c-6fc9-4484-99a5-c03a92da8f9e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1ae7ec05-410f-41ad-b2bc-19b534e49892

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ae7ec05-410f-41ad-b2bc-19b534e49892
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-33e89a804758","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ae7ec05-410f-41ad-b2bc-19b534e49892
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
Location: /v1/conversations/cnv_5e5c1c56-1798-490a-a4bb-e7f2b7314998
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5e5c1c56-1798-490a-a4bb-e7f2b7314998","subject":"Error contract","status":"open","region":"eu","participants":["qa-0625156bea35","qa-33e89a804758"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:03.928901819Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4be8efa3-88c8-4509-93d7-6b2d9b632900

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cc01253c094a461ab584aa0162458068
X-Correlation-Id: qa-4be8efa3-88c8-4509-93d7-6b2d9b632900
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4be8efa3-88c8-4509-93d7-6b2d9b632900
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-4be8efa3-88c8-4509-93d7-6b2d9b632900"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4f861e1f-fed6-451c-b4e0-d012dcd88e3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f861e1f-fed6-451c-b4e0-d012dcd88e3d
Content-Type: application/json

--- request body ---
{"handle":"qa-33e89a804758","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f861e1f-fed6-451c-b4e0-d012dcd88e3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3e564ad7-9a68-43d1-ac65-1d2e04c49ee3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-88956649-f960-4ec5-b45a-3843835c1ff5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88956649-f960-4ec5-b45a-3843835c1ff5
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-88956649-f960-4ec5-b45a-3843835c1ff5
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
correlation: qa-2dfbc7f2-68ee-40e3-abee-1b175a2acf37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dfbc7f2-68ee-40e3-abee-1b175a2acf37
Content-Type: application/json

--- request body ---
{"handle":"qa-33e89a804758","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2dfbc7f2-68ee-40e3-abee-1b175a2acf37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2dfbc7f2-68ee-40e3-abee-1b175a2acf37"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-058bc8ee-b306-491e-9dfa-d8972f692bf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-058bc8ee-b306-491e-9dfa-d8972f692bf0
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-058bc8ee-b306-491e-9dfa-d8972f692bf0
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
correlation: qa-7453acd5-a1eb-4f13-b08c-1b73319fba19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7453acd5-a1eb-4f13-b08c-1b73319fba19
Content-Type: application/json

--- request body ---
{"handle":"qa-0625156bea35","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7453acd5-a1eb-4f13-b08c-1b73319fba19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7453acd5-a1eb-4f13-b08c-1b73319fba19"}
```
