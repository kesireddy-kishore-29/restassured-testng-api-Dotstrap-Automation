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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-10a01226-4c68-4cd5-bc12-f55fc2c698f7` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-eccb77ea-dc1e-4c31-8c4c-752260560472` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-e21dff15-d48f-41c6-8c0f-f542c67958de` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-359f625b-552f-4f3e-b384-faa844cf23d7` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 31 | `qa-6d23608d-19e2-4eac-859f-450ae17640bc` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-852636ed-c44f-40cd-93b5-fab915c1311d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-826be083-5af5-48a6-928d-84f18fa0ad6d` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-771c92be-0d0c-423f-9ffa-bd370979eb99` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-c64b6aba-2fb1-4cda-9566-a202914a7584` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-1c78cc38-fb8f-418e-9057-44cc77469692` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-10a01226-4c68-4cd5-bc12-f55fc2c698f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10a01226-4c68-4cd5-bc12-f55fc2c698f7
Content-Type: application/json

--- request body ---
{"handle":"qa-eb2c07b4c67c","displayName":"QA eb2c07b4c67c","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-10a01226-4c68-4cd5-bc12-f55fc2c698f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Location: /v1/accounts/qa-eb2c07b4c67c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e42d470c-7289-42ef-8cc0-5675ed1e1373","handle":"qa-eb2c07b4c67c","displayName":"QA eb2c07b4c67c","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.748766767Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eccb77ea-dc1e-4c31-8c4c-752260560472

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eccb77ea-dc1e-4c31-8c4c-752260560472
Content-Type: application/json

--- request body ---
{"handle":"qa-c0900fd1bc4c","displayName":"QA c0900fd1bc4c","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-eccb77ea-dc1e-4c31-8c4c-752260560472
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 7
Location: /v1/accounts/qa-c0900fd1bc4c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2aece52d-006a-49af-a1c3-cdf046033cb2","handle":"qa-c0900fd1bc4c","displayName":"QA c0900fd1bc4c","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.802581519Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e21dff15-d48f-41c6-8c0f-f542c67958de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e21dff15-d48f-41c6-8c0f-f542c67958de
Content-Type: application/json

--- request body ---
{"handle":"qa-eb2c07b4c67c","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-e21dff15-d48f-41c6-8c0f-f542c67958de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e42d470c-7289-42ef-8cc0-5675ed1e1373"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-359f625b-552f-4f3e-b384-faa844cf23d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-359f625b-552f-4f3e-b384-faa844cf23d7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c0900fd1bc4c","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-359f625b-552f-4f3e-b384-faa844cf23d7
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
Location: /v1/conversations/cnv_205a7c48-7b66-429d-b0ac-e6e4931071ae
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_205a7c48-7b66-429d-b0ac-e6e4931071ae","subject":"Error contract","status":"open","region":"eu","participants":["qa-eb2c07b4c67c","qa-c0900fd1bc4c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.904352330Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_205a7c48-7b66-429d-b0ac-e6e4931071ae/messages
correlation: qa-6d23608d-19e2-4eac-859f-450ae17640bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d23608d-19e2-4eac-859f-450ae17640bc
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d23608d-19e2-4eac-859f-450ae17640bc
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_205a7c48-7b66-429d-b0ac-e6e4931071ae/messages","correlationId":"qa-6d23608d-19e2-4eac-859f-450ae17640bc"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-852636ed-c44f-40cd-93b5-fab915c1311d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-852636ed-c44f-40cd-93b5-fab915c1311d
Content-Type: application/json

--- request body ---
{"handle":"qa-c0900fd1bc4c","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-852636ed-c44f-40cd-93b5-fab915c1311d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2aece52d-006a-49af-a1c3-cdf046033cb2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-826be083-5af5-48a6-928d-84f18fa0ad6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-826be083-5af5-48a6-928d-84f18fa0ad6d
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-826be083-5af5-48a6-928d-84f18fa0ad6d
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
correlation: qa-771c92be-0d0c-423f-9ffa-bd370979eb99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-771c92be-0d0c-423f-9ffa-bd370979eb99
Content-Type: application/json

--- request body ---
{"handle":"qa-c0900fd1bc4c","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-771c92be-0d0c-423f-9ffa-bd370979eb99
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-771c92be-0d0c-423f-9ffa-bd370979eb99"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c64b6aba-2fb1-4cda-9566-a202914a7584

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c64b6aba-2fb1-4cda-9566-a202914a7584
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c64b6aba-2fb1-4cda-9566-a202914a7584
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
correlation: qa-1c78cc38-fb8f-418e-9057-44cc77469692

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c78cc38-fb8f-418e-9057-44cc77469692
Content-Type: application/json

--- request body ---
{"handle":"qa-eb2c07b4c67c","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c78cc38-fb8f-418e-9057-44cc77469692
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1c78cc38-fb8f-418e-9057-44cc77469692"}
```
