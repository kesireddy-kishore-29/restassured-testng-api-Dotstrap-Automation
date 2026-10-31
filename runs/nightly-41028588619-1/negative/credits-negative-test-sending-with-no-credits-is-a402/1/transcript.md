# Transcript: With no credits left, a message is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#sendingWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-cd1e23c5-e79f-4dc0-963e-2541f4bd49c4` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-45c50b04-09d1-4c2a-b274-0e17c18b7a8b` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-ac6b6f30-2d84-465c-bdef-ee6ec2c1c839` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-7c8d6a0e-0833-4006-a0c6-4fba76ace664` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 24 | `qa-4a554e8a-b792-484d-81da-30a186a587db` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-46fce7fc-935a-4d09-8973-78e34fc3d962` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-af2c63ec-c3a3-43c9-a82d-e093c1dbbaaa` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 6 | `qa-8dd286a1-e755-4f9c-83af-d2e7ca1621a0` |
| 9 | `GET /v1/credits/balance` | 200 | 5 | `qa-b9e2e0f0-a6d7-44ae-bf30-6b5c94db37e1` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 11 | `qa-f0298b1c-c70a-4edc-a5c5-6083d4fb4e69` |
| 11 | `GET /v1/credits/ledger` | 200 | 17 | `qa-790c5e2c-ef53-4f1d-8560-a8aeac6fbd7d` |
| 12 | `POST /v1/auth/token` | 200 | 7 | `qa-561d1072-bebb-4d54-8c48-5e4a6788d928` |
| 13 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-9c5f55d3-a7ee-482f-8cdb-b39e72aca6b9` |
| 14 | `POST /v1/auth/token` | 401 | 4 | `qa-f9a83514-7ef5-469a-9fb3-a11aa01372a8` |
| 15 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-5f0f0dc6-fec9-4263-b655-6c10dfef9f9f` |
| 16 | `POST /v1/auth/token` | 401 | 3 | `qa-480bd58d-483e-406e-b94c-c196d48f9a24` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cd1e23c5-e79f-4dc0-963e-2541f4bd49c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd1e23c5-e79f-4dc0-963e-2541f4bd49c4
Content-Type: application/json

--- request body ---
{"handle":"qa-bdf73a933c33","displayName":"QA bdf73a933c33","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd1e23c5-e79f-4dc0-963e-2541f4bd49c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Location: /v1/accounts/qa-bdf73a933c33
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d01241ab-53c8-44e9-9844-c200d9c40931","handle":"qa-bdf73a933c33","displayName":"QA bdf73a933c33","region":"eu","role":"user","createdAt":"2026-10-30T08:45:49.629481014Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-45c50b04-09d1-4c2a-b274-0e17c18b7a8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45c50b04-09d1-4c2a-b274-0e17c18b7a8b
Content-Type: application/json

--- request body ---
{"handle":"qa-b520d9223727","displayName":"QA b520d9223727","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-45c50b04-09d1-4c2a-b274-0e17c18b7a8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Location: /v1/accounts/qa-b520d9223727
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6a778f92-920a-4535-af51-6ae22759d3fb","handle":"qa-b520d9223727","displayName":"QA b520d9223727","region":"eu","role":"user","createdAt":"2026-10-30T08:45:49.648696349Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ac6b6f30-2d84-465c-bdef-ee6ec2c1c839

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac6b6f30-2d84-465c-bdef-ee6ec2c1c839
Content-Type: application/json

--- request body ---
{"handle":"qa-bdf73a933c33","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac6b6f30-2d84-465c-bdef-ee6ec2c1c839
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d01241ab-53c8-44e9-9844-c200d9c40931"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7c8d6a0e-0833-4006-a0c6-4fba76ace664

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c8d6a0e-0833-4006-a0c6-4fba76ace664
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b520d9223727","subject":"Many messages","message":"1"}

--- response: 201 in 13 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c8d6a0e-0833-4006-a0c6-4fba76ace664
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
Location: /v1/conversations/cnv_88ce640f-ed2e-4909-9665-25e51e32f9bf
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_88ce640f-ed2e-4909-9665-25e51e32f9bf","subject":"Many messages","status":"open","region":"eu","participants":["qa-bdf73a933c33","qa-b520d9223727"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:45:49.702588444Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_88ce640f-ed2e-4909-9665-25e51e32f9bf/messages
correlation: qa-4a554e8a-b792-484d-81da-30a186a587db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a554e8a-b792-484d-81da-30a186a587db
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 24 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a554e8a-b792-484d-81da-30a186a587db
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
Content-Length: 192

{"id":"msg_06ff9281-7589-4bf5-9a5f-d7412069cc81","conversationId":"cnv_88ce640f-ed2e-4909-9665-25e51e32f9bf","sender":"qa-bdf73a933c33","body":"2","createdAt":"2026-10-30T08:45:49.740461572Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_88ce640f-ed2e-4909-9665-25e51e32f9bf/messages
correlation: qa-46fce7fc-935a-4d09-8973-78e34fc3d962

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46fce7fc-935a-4d09-8973-78e34fc3d962
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 10 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-46fce7fc-935a-4d09-8973-78e34fc3d962
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
Content-Length: 192

{"id":"msg_9497c2a9-b03e-4f18-a636-c5672fd936d0","conversationId":"cnv_88ce640f-ed2e-4909-9665-25e51e32f9bf","sender":"qa-bdf73a933c33","body":"3","createdAt":"2026-10-30T08:45:49.768499717Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_88ce640f-ed2e-4909-9665-25e51e32f9bf/messages
correlation: qa-af2c63ec-c3a3-43c9-a82d-e093c1dbbaaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af2c63ec-c3a3-43c9-a82d-e093c1dbbaaa
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 12 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-af2c63ec-c3a3-43c9-a82d-e093c1dbbaaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_e3334c27-03d7-4bee-a26e-4013a5b8d2cf","conversationId":"cnv_88ce640f-ed2e-4909-9665-25e51e32f9bf","sender":"qa-bdf73a933c33","body":"4","createdAt":"2026-10-30T08:45:49.789891009Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_88ce640f-ed2e-4909-9665-25e51e32f9bf/messages
correlation: qa-8dd286a1-e755-4f9c-83af-d2e7ca1621a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dd286a1-e755-4f9c-83af-d2e7ca1621a0
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 6 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dd286a1-e755-4f9c-83af-d2e7ca1621a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_d8ae8353-65b4-477c-8e5a-d0ac79f84748","conversationId":"cnv_88ce640f-ed2e-4909-9665-25e51e32f9bf","sender":"qa-bdf73a933c33","body":"5","createdAt":"2026-10-30T08:45:49.809423219Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-b9e2e0f0-a6d7-44ae-bf30-6b5c94db37e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9e2e0f0-a6d7-44ae-bf30-6b5c94db37e1
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9e2e0f0-a6d7-44ae-bf30-6b5c94db37e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_d01241ab-53c8-44e9-9844-c200d9c40931"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_88ce640f-ed2e-4909-9665-25e51e32f9bf/messages
correlation: qa-f0298b1c-c70a-4edc-a5c5-6083d4fb4e69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0298b1c-c70a-4edc-a5c5-6083d4fb4e69
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 11 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0298b1c-c70a-4edc-a5c5-6083d4fb4e69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 320

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_88ce640f-ed2e-4909-9665-25e51e32f9bf/messages","correlationId":"qa-f0298b1c-c70a-4edc-a5c5-6083d4fb4e69"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-790c5e2c-ef53-4f1d-8560-a8aeac6fbd7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-790c5e2c-ef53-4f1d-8560-a8aeac6fbd7d
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-790c5e2c-ef53-4f1d-8560-a8aeac6fbd7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 1169

{"items":[{"id":"led_56187d3b-7ead-42d1-aff9-058957ef3d3c","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-30T08:45:49.629499241Z"},{"id":"led_7cbf9377-3305-447b-9f5e-010ee195feeb","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_88ce640f-ed2e-4909-9665-25e51e32f9bf","createdAt":"2026-10-30T08:45:49.702553562Z"},{"id":"led_da525252-c57c-4f9c-b787-d0e33277f727","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_06ff9281-7589-4bf5-9a5f-d7412069cc81","createdAt":"2026-10-30T08:45:49.740429865Z"},{"id":"led_928b52e6-b08e-47f5-b52b-0166f7eb1f76","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_9497c2a9-b03e-4f18-a636-c5672fd936d0","createdAt":"2026-10-30T08:45:49.768475100Z"},{"id":"led_76ff1acb-ad00-4433-a1f7-5bba4d4a429d","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_e3334c27-03d7-4bee-a26e-4013a5b8d2cf","createdAt":"2026-10-30T08:45:49.789881545Z"},{"id":"led_9b8a19c9-d1b8-426c-9052-08957d3ccb99","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_d8ae8353-65b4-477c-8e5a-d0ac79f84748","createdAt":"2026-10-30T08:45:49.809402428Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-561d1072-bebb-4d54-8c48-5e4a6788d928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-561d1072-bebb-4d54-8c48-5e4a6788d928
Content-Type: application/json

--- request body ---
{"handle":"qa-b520d9223727","password":"****"}

--- response: 200 in 7 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-561d1072-bebb-4d54-8c48-5e4a6788d928
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6a778f92-920a-4535-af51-6ae22759d3fb"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9c5f55d3-a7ee-482f-8cdb-b39e72aca6b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c5f55d3-a7ee-482f-8cdb-b39e72aca6b9
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9c5f55d3-a7ee-482f-8cdb-b39e72aca6b9
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-f9a83514-7ef5-469a-9fb3-a11aa01372a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9a83514-7ef5-469a-9fb3-a11aa01372a8
Content-Type: application/json

--- request body ---
{"handle":"qa-b520d9223727","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9a83514-7ef5-469a-9fb3-a11aa01372a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f9a83514-7ef5-469a-9fb3-a11aa01372a8"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f0f0dc6-fec9-4263-b655-6c10dfef9f9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f0f0dc6-fec9-4263-b655-6c10dfef9f9f
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f0f0dc6-fec9-4263-b655-6c10dfef9f9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-480bd58d-483e-406e-b94c-c196d48f9a24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-480bd58d-483e-406e-b94c-c196d48f9a24
Content-Type: application/json

--- request body ---
{"handle":"qa-bdf73a933c33","password":"****"}

--- response: 401 in 3 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-480bd58d-483e-406e-b94c-c196d48f9a24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-480bd58d-483e-406e-b94c-c196d48f9a24"}
```
